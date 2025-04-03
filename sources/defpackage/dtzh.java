package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dtzh {
    public static dtzh c(String str, String[] strArr) {
        return new dtrk(str, strArr == null ? Arrays.asList(new String[0]) : Arrays.asList(strArr));
    }

    public abstract String a();

    public abstract List b();
}
