package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ytz extends ffhv implements ffjm {
    final /* synthetic */ yud a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytz(yud yudVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = yudVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ytz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        final yud yudVar = this.a;
        yudVar.g.d(true, new ffji() { // from class: ytx
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                yud yudVar2 = yud.this;
                final ajiy ajiyVar = (ajiy) obj2;
                String string = yudVar2.c.getString(R.string.location_shortcut_attach_current_error);
                string.getClass();
                String string2 = yudVar2.c.getString(android.R.string.ok);
                string2.getClass();
                return new dmve(string, null, null, null, false, false, new doas(string2, new ffix() { // from class: yty
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ajiy.this.a();
                        return ffcu.a;
                    }
                }), null, null, 446);
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ytz(this.a, ffguVar);
    }
}
