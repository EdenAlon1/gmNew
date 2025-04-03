package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class akup {
    public static akuo d() {
        akuh akuhVar = new akuh();
        akuhVar.a = new Supplier() { // from class: akun
            @Override // java.util.function.Supplier
            public final Object get() {
                return true;
            }
        };
        return akuhVar;
    }

    public abstract int a();

    public abstract String b();

    public abstract Supplier c();
}
