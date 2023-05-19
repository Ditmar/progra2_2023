package arrayextension;

import java.util.ArrayList;

public class ImproveData<E> extends ArrayList<E> {

    public ImproveData<E> map(GenericMap<E> runMap) {
        ImproveData<E> result = new ImproveData<E>();
        for (E item : this) {
            if (runMap != null) {
                result.add(runMap.run(item));
            }
        }
        return result;
    }

    public ImproveData<E> filter(GenericFilter<E> runFilter) {
        ImproveData<E> result = new ImproveData<E>();
        for (E item : this) {
            if (runFilter != null) {

                if (runFilter.run(item)) {
                    result.add(item);
                }

            }
        }
        return result;
    }
}
