package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class csxn {
    public abstract String a();

    public abstract String b();

    public abstract List c();

    public final csxo d(String str) {
        return (csxo) ((Map) c().get(0)).get(str);
    }
}
