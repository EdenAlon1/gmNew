package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czxd implements ffjm {
    final /* synthetic */ czxf a;
    final /* synthetic */ ffix b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ ParticipantsTable.BindData d;

    public czxd(czxf czxfVar, ffix ffixVar, ConversationIdType conversationIdType, ParticipantsTable.BindData bindData) {
        this.a = czxfVar;
        this.b = ffixVar;
        this.c = conversationIdType;
        this.d = bindData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            czxo czxoVar = (czxo) this.a.a.b();
            String string = czxoVar.a.getString(R.string.unwanted_messages_toolstone_link);
            string.getClass();
            String string2 = czxoVar.a.getString(R.string.unwanted_messages_toolstone_text, string);
            string2.getClass();
            czxn f = czxo.f(czxoVar, string2, string, Integer.valueOf(R.drawable.gs_gshield_vd_theme_24), 504);
            Object[] objArr = new Object[0];
            hfdVar.v(-737163815);
            boolean F = hfdVar.F(this.a);
            final czxf czxfVar = this.a;
            Object f2 = hfdVar.f();
            if (F || f2 == hfc.a) {
                f2 = new ffix() { // from class: czwy
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return czxf.this.e;
                    }
                };
                hfdVar.y(f2);
            }
            hfdVar.o();
            final hho hhoVar = (hho) hqr.c(objArr, null, (ffix) f2, hfdVar, 0, 6);
            hfdVar.v(-737161841);
            boolean D = hfdVar.D(hhoVar) | hfdVar.F(this.a) | hfdVar.D(this.b) | hfdVar.F(this.c);
            final czxf czxfVar2 = this.a;
            final ffix ffixVar = this.b;
            final ConversationIdType conversationIdType = this.c;
            Object f3 = hfdVar.f();
            if (D || f3 == hfc.a) {
                f3 = new ffix() { // from class: czwz
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        hhoVar.b(false);
                        czxf czxfVar3 = czxf.this;
                        czxfVar3.f = true;
                        ffixVar.invoke();
                        ((avjw) czxfVar3.b.b()).e(conversationIdType, avji.HIDE, true);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f3);
            }
            hfdVar.o();
            cru.b(((Boolean) hhoVar.a()).booleanValue(), null, ctt.l(null, 3), ctt.m(null, 3), null, hpx.d(-1541617772, new czxc(this.a, this.c, this.d, (ffix) f3, f), hfdVar), hfdVar, 200064, 18);
        }
        return ffcu.a;
    }
}
