package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajdn extends ffhv implements ffjn {
    int a;
    /* synthetic */ boolean b;
    /* synthetic */ boolean c;
    final /* synthetic */ ajee d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajdn(ajee ajeeVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.d = ajeeVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        ajdn ajdnVar = new ajdn(this.d, (ffgu) obj3);
        ajdnVar.b = booleanValue;
        ajdnVar.c = booleanValue2;
        return ajdnVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        boolean z = this.b;
        boolean z2 = this.c;
        ajee ajeeVar = this.d;
        this.a = 1;
        Object c = ajeeVar.c(z, z2, ajeeVar.e instanceof PenpalBotConversationId, this);
        return c == ffhhVar ? ffhhVar : c;
    }
}
