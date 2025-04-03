package defpackage;

import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aetg extends ffhv implements ffji {
    int a;
    final /* synthetic */ aetk b;
    final /* synthetic */ GalleryContent c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aetg(aetk aetkVar, GalleryContent galleryContent, int i, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = aetkVar;
        this.c = galleryContent;
        this.d = i;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        aetk aetkVar = this.b;
        GalleryContent galleryContent = this.c;
        int i2 = this.d;
        this.a = 1;
        Object b = aetkVar.b(galleryContent, i2, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new aetg(this.b, this.c, this.d, (ffgu) obj).b(ffcu.a);
    }
}
