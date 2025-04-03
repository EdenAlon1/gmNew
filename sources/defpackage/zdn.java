package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zdn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ zdo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdn(zdo zdoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = zdoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zdn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            zdo zdoVar = this.b;
            String string = zdoVar.a.getResources().getString(R.string.data_required_download_snackbar_message);
            string.getClass();
            String string2 = this.b.a.getResources().getString(R.string.data_required_snackbar_action);
            final zdo zdoVar2 = this.b;
            ablt abltVar = new ablt(string, string2, false, 0, new ffix() { // from class: zdm
                @Override // defpackage.ffix
                public final Object invoke() {
                    zdo.this.b.h(new aikd());
                    return ffcu.a;
                }
            }, 57);
            this.a = 1;
            if (zdoVar.f.a(abltVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zdn(this.b, ffguVar);
    }
}
