package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adaf extends ffhv implements ffjm {
    final /* synthetic */ adaj a;
    final /* synthetic */ MessageIdType b;
    final /* synthetic */ String c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adaf(ffgu ffguVar, adaj adajVar, MessageIdType messageIdType, String str) {
        super(2, ffguVar);
        this.a = adajVar;
        this.b = messageIdType;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adaf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        MessageIdType messageIdType = this.b;
        adaj adajVar = this.a;
        adajVar.c.d("EmotifyReactionDatabaseUpdater::lookForReactionAndUpdateDatabase", new adai(messageIdType, adajVar, this.c));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        adaf adafVar = new adaf(ffguVar, this.a, this.b, this.c);
        adafVar.d = obj;
        return adafVar;
    }
}
