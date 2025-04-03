package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajbp extends ffhv implements ffjo {
    int a;
    /* synthetic */ boolean b;
    /* synthetic */ Object c;
    /* synthetic */ boolean d;
    final /* synthetic */ ajbx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajbp(ajbx ajbxVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.e = ajbxVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        ajbp ajbpVar = new ajbp(this.e, (ffgu) obj4);
        ajbpVar.b = booleanValue;
        ajbpVar.c = (aixr) obj2;
        ajbpVar.d = booleanValue2;
        return ajbpVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        boolean z;
        boolean z2;
        List<aixs> list;
        boolean z3;
        boolean z4;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            z2 = this.d;
            z = this.b;
            list = (List) this.c;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            z = this.b;
            aixr aixrVar = (aixr) this.c;
            boolean z5 = this.d;
            List list2 = aixrVar != null ? aixrVar.b : null;
            ajbx ajbxVar = this.e;
            this.c = list2;
            this.a = 1;
            Object c = ajbxVar.f.c(this);
            if (c == ffhhVar) {
                return ffhhVar;
            }
            z2 = z5;
            list = list2;
            obj = c;
        }
        boolean z6 = z;
        boolean z7 = !((Boolean) obj).booleanValue();
        if (list != null && !list.isEmpty()) {
            for (aixs aixsVar : list) {
                if (aixsVar == aixs.c || aixsVar == aixs.d) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        if (list != null && !list.isEmpty()) {
            for (aixs aixsVar2 : list) {
                if (aixsVar2 == aixs.e || aixsVar2 == aixs.f) {
                    z4 = true;
                    break;
                }
            }
        }
        z4 = false;
        return new ajbc(z7, z3, z4, z6 && !z2, this.e.c instanceof PenpalBotConversationId, z6);
    }
}
