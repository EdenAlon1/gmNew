package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fevi {
    private fevi() {
    }

    public static Set a(Map map, String str) {
        Status.Code code;
        List f = feok.f(map, str);
        if (f == null) {
            return null;
        }
        EnumSet noneOf = EnumSet.noneOf(Status.Code.class);
        for (Object obj : f) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                int intValue = d.intValue();
                emyw.b(((double) intValue) == d.doubleValue(), "Status code %s is not integral", obj);
                code = Status.fromCodeValue(intValue).getCode();
                emyw.b(code.value() == d.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new emyx("Can not convert status code " + String.valueOf(obj) + " to Status.Code, because its type is " + String.valueOf(obj.getClass()));
                }
                try {
                    Status.Code code2 = Status.Code.OK;
                    code = (Status.Code) Enum.valueOf(Status.Code.class, (String) obj);
                } catch (IllegalArgumentException e) {
                    throw new emyx(a.F(obj, "Status code ", " is not valid"), e);
                }
            }
            noneOf.add(code);
        }
        return DesugarCollections.unmodifiableSet(noneOf);
    }
}
