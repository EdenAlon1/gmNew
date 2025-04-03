package defpackage;

import com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dawm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx b;
    final /* synthetic */ LoadMessagesReceiver c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dawm(ffxx ffxxVar, ffgu ffguVar, LoadMessagesReceiver loadMessagesReceiver) {
        super(2, ffguVar);
        this.b = ffxxVar;
        this.c = loadMessagesReceiver;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dawm) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxy ffxyVar = (ffxy) this.d;
            ffxx ffxxVar = this.b;
            dawl dawlVar = new dawl(ffxyVar, this.c);
            this.a = 1;
            if (ffxxVar.a(dawlVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dawm dawmVar = new dawm(this.b, ffguVar, this.c);
        dawmVar.d = obj;
        return dawmVar;
    }
}
