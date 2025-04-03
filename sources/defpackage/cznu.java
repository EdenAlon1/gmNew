package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cznu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ czns b;
    final /* synthetic */ Intent c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cznu(czns cznsVar, Intent intent, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cznsVar;
        this.c = intent;
        this.d = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cznu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            czns cznsVar = this.b;
            Intent intent = this.c;
            String str = this.d;
            this.a = 1;
            if (cznsVar.b(intent, str, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cznu(this.b, this.c, this.d, ffguVar);
    }
}
