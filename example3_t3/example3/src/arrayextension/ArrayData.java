package arrayextension;

import java.util.ArrayList;

public class ArrayData {
    private ArrayList<String> data;

    public ArrayData() {
        this.data = new ArrayList<>();

    }

    public ArrayList<String> map(Map runMap) {
        ArrayList<String> result = new ArrayList<>();
        for (String item : this.data) {
            if (runMap != null) {
                result.add(runMap.run(item));
            }
        }
        return result;
    }

    public ArrayList<String> filter(Filter runFilter) {
        ArrayList<String> result = new ArrayList<>();
        for (String item : this.data) {
            if (runFilter != null) {

                if (runFilter.run(item)) {
                    result.add(item);
                }

            }
        }
        return result;
    }

    public ArrayList<String> getData() {
        return data;
    }

    public void setData(ArrayList<String> data) {
        this.data = data;
    }

}
