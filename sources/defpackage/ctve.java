package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctve {
    private static final emyz b;
    public final ctvi a;

    static {
        emzf emzfVar = new emzf();
        emzfVar.f(((Integer) dizg.o().a.an.a()).intValue());
        emzfVar.e(((Integer) dizg.o().a.ao.a()).intValue(), TimeUnit.SECONDS);
        b = emzfVar.a();
    }

    public ctve(ctvi ctviVar) {
        this.a = ctviVar;
    }

    private static String c(String str, emyl emylVar) {
        emyz emyzVar = b;
        String str2 = (String) emyzVar.b(str);
        if (str2 != null) {
            return str2;
        }
        String str3 = (String) emylVar.get();
        emyzVar.d(str, str3);
        return str3;
    }

    public final String a() {
        final ctvi ctviVar = this.a;
        ctviVar.getClass();
        return c("main", new emyl() { // from class: ctvc
            @Override // defpackage.emyl
            public final Object get() {
                return ctvi.this.c();
            }
        });
    }

    public final String b(final int i) {
        return c(String.valueOf(i), new emyl() { // from class: ctvd
            @Override // defpackage.emyl
            public final Object get() {
                return ctve.this.a.d(i);
            }
        });
    }
}
