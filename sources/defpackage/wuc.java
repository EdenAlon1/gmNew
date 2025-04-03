package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wuc extends ffhv implements ffjn {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ wug c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wuc(wug wugVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = wugVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        wuc wucVar = new wuc(this.c, (ffgu) obj3);
        wucVar.a = booleanValue;
        wucVar.b = (aaxe) obj2;
        return wucVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        boolean z = this.a;
        Object obj2 = this.b;
        if (!((aspy) this.c.d.b()).a() && z) {
            return null;
        }
        wug wugVar = this.c;
        if (wugVar.c instanceof PenpalBotConversationId) {
            return null;
        }
        String string = wugVar.b.getString(R.string.delete_message_action);
        string.getClass();
        final wug wugVar2 = this.c;
        final aaxe aaxeVar = (aaxe) obj2;
        return new dlsr(string, dmzz.aD, false, false, false, false, null, false, null, new ffix() { // from class: wua
            @Override // defpackage.ffix
            public final Object invoke() {
                wug wugVar3 = wug.this;
                wugVar3.e(aaxeVar.a, false, new wub(wugVar3.g));
                return ffcu.a;
            }
        }, 1020);
    }
}
