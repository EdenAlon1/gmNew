package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajpp implements ciqa {
    private static final entd a = entd.c("BugleNotifications");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final cqoh e;
    private final ajpw f;
    private final ajpf g;

    public ajpp(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, cqoh cqohVar, ajpw ajpwVar, ajpf ajpfVar) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = cqohVar;
        this.f = ajpwVar;
        this.g = ajpfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ciqa
    public final cipz a(cins cinsVar) {
        String str;
        boolean z;
        boolean z2;
        MessagePartCoreData G;
        final long epochMilli = this.e.f().toEpochMilli();
        bxco c = bxct.c();
        c.z("getUnnotifiedTriggeredReminders");
        c.e(new Function() { // from class: cnlc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bxcs bxcsVar = (bxcs) obj;
                bxcsVar.e(epochMilli);
                bxcsVar.d(byzf.SET);
                return bxcsVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw y = c.b().y();
        ArrayList arrayList = new ArrayList(((enou) y).c);
        enqv it = y.iterator();
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            bxbi bxbiVar = (bxbi) it.next();
            MessageCoreData v = ((bdmq) this.b.b()).v(bxbiVar.m());
            if (v != null) {
                ConversationIdType z3 = v.z();
                if (!z3.b()) {
                    String ar = v.ar();
                    String V = (!TextUtils.isEmpty(ar) || (G = v.G()) == null) ? null : G.V();
                    ParticipantsTable.BindData b = ((bdrr) this.c.b()).b(v.aA());
                    if (b == null) {
                        str = null;
                        z = false;
                    } else if (bdtd.m(b)) {
                        z = true;
                        str = null;
                    } else {
                        z = false;
                        str = !TextUtils.isEmpty(b.Q()) ? b.Q() : !TextUtils.isEmpty(b.R()) ? b.R() : b.P();
                    }
                    bseh r = ((bczy) this.d.b()).r(v.z());
                    if (r != null) {
                        str2 = r.X();
                        z2 = r.q() > 1;
                    } else {
                        z2 = false;
                    }
                    arrayList.add(new ajpc(str, ar, V, bxbiVar.n(), bxbiVar.k(), z3, str2, z2, z));
                }
            }
        }
        if (arrayList.isEmpty()) {
            ((ensz) a.o().h("com/google/android/apps/messaging/reminder/notification/ReminderNotificationFactoryImpl", "createReminderNotification", 80, "ReminderNotificationFactoryImpl.java")).q("no unseen reminder message notifications.");
            return null;
        }
        if (arrayList.size() <= 1) {
            return this.f.a(cinsVar, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(this.f.a(cinsVar, enkr.c((ajpn) it2.next())));
        }
        ajpf ajpfVar = this.g;
        Context context = (Context) ajpfVar.a.b();
        context.getClass();
        cine cineVar = (cine) ajpfVar.b.b();
        cineVar.getClass();
        cthp cthpVar = (cthp) ajpfVar.c.b();
        cthpVar.getClass();
        ctia ctiaVar = (ctia) ajpfVar.d.b();
        ctiaVar.getClass();
        cthz cthzVar = (cthz) ajpfVar.e.b();
        cthzVar.getClass();
        cuxh cuxhVar = (cuxh) ajpfVar.g.b();
        cuxhVar.getClass();
        Optional optional = (Optional) ajpfVar.h.b();
        optional.getClass();
        Optional optional2 = (Optional) ajpfVar.i.b();
        optional2.getClass();
        Optional optional3 = (Optional) ajpfVar.j.b();
        optional3.getClass();
        ayfg ayfgVar = (ayfg) ajpfVar.k.b();
        ayfgVar.getClass();
        cwmm cwmmVar = (cwmm) ajpfVar.l.b();
        cwmmVar.getClass();
        return new ajpe(context, cineVar, cthpVar, ctiaVar, cthzVar, ajpfVar.f, cuxhVar, optional, optional2, optional3, ayfgVar, cinsVar, arrayList, cwmmVar, arrayList2);
    }
}
