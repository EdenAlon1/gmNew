package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aayo extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ abac c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aayo(abac abacVar, String str, String str2, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = abacVar;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aayo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            obj2 = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            ewnk a = ((ctot) this.c.p.b()).a(this.d, this.e);
            if (a == null) {
                return ffcu.a;
            }
            xho xhoVar = new xho(new dsci(a), new xhn(this.c.K.a(), (Uri) null, (emyg) null, (ffss) null, 62));
            xih c = this.c.c();
            this.a = a;
            this.b = 1;
            Object a2 = c.a(xhoVar, this);
            if (a2 == ffhhVar) {
                return ffhhVar;
            }
            obj2 = a;
            obj = a2;
        }
        if (!((Boolean) obj).booleanValue()) {
            ((enrr) abac.a.i().h("com/google/android/apps/messaging/conversation2/messagelist/suggestion/SuggestionUiAdapterImpl$handleEmotionSuggestion$1", "invokeSuspend", 815, "SuggestionUiAdapterImpl.kt")).q("Failed to send emotion suggestion");
            return ffcu.a;
        }
        ((cswx) this.c.q.b()).c(new csxi(((ewnk) obj2).c, this.d));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aayo(this.c, this.d, this.e, ffguVar);
    }
}
