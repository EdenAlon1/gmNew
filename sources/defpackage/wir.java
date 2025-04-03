package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wir extends ffhv implements ffjn {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ wiv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wir(wiv wivVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = wivVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        wir wirVar = new wir(this.c, (ffgu) obj3);
        wirVar.a = booleanValue;
        wirVar.b = (win) obj2;
        return wirVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        boolean z = this.a;
        Object obj2 = this.b;
        if (!z || (this.c.b instanceof PenpalBotConversationId)) {
            int i = engw.d;
            return enou.a;
        }
        int ordinal = ((win) obj2).ordinal();
        if (ordinal == 0) {
            if (((Boolean) ctjd.bp.e()).booleanValue() && !((asuf) this.c.a.b()).a()) {
                return engw.r(new wip());
            }
            int i2 = engw.d;
            return enou.a;
        }
        if (ordinal != 2) {
            int i3 = engw.d;
            return enou.a;
        }
        if (((Boolean) ctjd.bo.e()).booleanValue()) {
            return engw.r(new wiq());
        }
        int i4 = engw.d;
        return enou.a;
    }
}
