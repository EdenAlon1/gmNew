package defpackage;

import com.google.android.apps.messaging.conversation2.bottomcontent.composerow.draft.attachment.RichLocation;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ytw extends ffhv implements ffjm {
    final /* synthetic */ yud a;
    final /* synthetic */ RichLocation b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytw(yud yudVar, RichLocation richLocation, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = yudVar;
        this.b = richLocation;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ytw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.e.e(this.b);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ytw(this.a, this.b, ffguVar);
    }
}
