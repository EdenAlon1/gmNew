package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyfx implements fbba {
    public static dydc a(final dyfb dyfbVar, final eisx eisxVar, final ejar ejarVar, final errm errmVar) {
        return new dygt(emys.a(new emyl() { // from class: dygn
            @Override // defpackage.emyl
            public final Object get() {
                elfl g = elfl.g(ejar.this.a(eisxVar));
                final dyfb dyfbVar2 = dyfbVar;
                dyfbVar2.getClass();
                return g.h(new emwl() { // from class: dyfy
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return dyfb.this.a((Account) obj);
                    }
                }, errmVar);
            }
        }), errmVar);
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
