package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yvx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yvz b;
    final /* synthetic */ Context c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvx(ffgu ffguVar, yvz yvzVar, Context context) {
        super(2, ffguVar);
        this.b = yvzVar;
        this.c = context;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yvx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ensk e = yvz.a.e();
        e.Y(ente.a, "BugleComposeRow2");
        ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceInputUiAdapter$onLongPress$$inlined$asyncPropagatingLegacy$default$1", "invokeSuspend", 115, "VoiceInputUiAdapter.kt")).q("Voice input long press");
        if (((ywq) this.b.d.b()).i()) {
            return true;
        }
        yvz yvzVar = this.b;
        Context context = this.c;
        this.a = 1;
        Object c = yvzVar.c(context, 3, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        yvx yvxVar = new yvx(ffguVar, this.b, this.c);
        yvxVar.d = obj;
        return yvxVar;
    }
}
