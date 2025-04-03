package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqrr extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dqok c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqrr(dqok dqokVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dqokVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqrr) c((String) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        String str;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            str = (String) this.b;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            String str2 = (String) this.b;
            dqok dqokVar = this.c;
            this.b = str2;
            this.a = 1;
            Object e = dqokVar.e(str2, this);
            if (e == ffhhVar) {
                return ffhhVar;
            }
            str = str2;
            obj = e;
        }
        dqqj dqqjVar = (dqqj) obj;
        if (dqqjVar != null) {
            return dqqjVar;
        }
        dqqh dqqhVar = new dqqh(new dqnr(str));
        ((enrr) enru.c("com/google/android/libraries/compose/emoji/data/usage/EmojiUsageModule$emojiDescriptor$2").i().h("com/google/android/libraries/compose/emoji/data/usage/EmojiUsageModule$emojiDescriptor$2", "invokeSuspend", 36, "EmojiUsageModule.kt")).D("Couldn't lookup '%s', returning fallback %s", str, dqqhVar);
        return dqqhVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dqrr dqrrVar = new dqrr(this.c, ffguVar);
        dqrrVar.b = obj;
        return dqrrVar;
    }
}
