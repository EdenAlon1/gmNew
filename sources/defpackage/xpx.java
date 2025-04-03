package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class xpx implements dpzo, ffke {
    final /* synthetic */ dqlx a;

    public xpx(dqlx dqlxVar) {
        this.a = dqlxVar;
    }

    @Override // defpackage.dpzo
    public final /* bridge */ /* synthetic */ Object a(drnm drnmVar, ffgu ffguVar) {
        Object a = this.a.a(drnmVar, ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    @Override // defpackage.ffke
    public final ffbv b() {
        return new ffju(2, this.a, dqlx.class, "addAttachment", "addAttachment(Lcom/google/android/libraries/compose/attachments/Attachment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dpzo) && (obj instanceof ffke)) {
            return ffkj.e(b(), ((ffke) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
