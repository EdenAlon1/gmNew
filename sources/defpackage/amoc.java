package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amoc implements amoe {
    public static final entd a = entd.c("BugleWearable");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;

    public amoc(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffbrVar9.getClass();
        ffbrVar10.getClass();
        this.b = ffbrVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.c = ffbrVar4;
        this.i = ffbrVar5;
        this.d = ffbrVar6;
        this.e = ffbrVar7;
        this.j = ffbrVar8;
        this.f = ffbrVar9;
        this.k = ffbrVar10;
    }

    private final Map g(Set set) {
        try {
            dgsq dgsqVar = (dgsq) this.i.b();
            ArrayList arrayList = new ArrayList(ffdx.n(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Uri build = new Uri.Builder().scheme("sms").opaquePart((String) it.next()).build();
                build.getClass();
                arrayList.add(build);
            }
            Object f = dhrt.f(dgsqVar.a(ffdx.V(arrayList)));
            f.getClass();
            return cggs.b((Map) f);
        } catch (Exception unused) {
            ensz enszVar = (ensz) a.j();
            enszVar.Y(csux.O, "ConversationTrustedContactsApi");
            enszVar.q("Exception thrown by the Family Link API when querying areAllowed");
            LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(set, 10)), 16));
            for (Object obj : set) {
                linkedHashMap.put(obj, false);
            }
            return linkedHashMap;
        }
    }

    @Override // defpackage.amoe
    public final elfl a(ConversationId conversationId, amny amnyVar) {
        elfl c;
        amnyVar.getClass();
        Object b = this.g.b();
        b.getClass();
        c = axol.c((ffsk) b, ffhe.a, ffsm.a, new amoa(conversationId, amnyVar, this, null));
        return c;
    }

    @Override // defpackage.amoe
    public final elfl b(ConversationId conversationId) {
        elfl c;
        Object b = this.g.b();
        b.getClass();
        c = axol.c((ffsk) b, ffhe.a, ffsm.a, new amob(this, conversationId, null));
        return c;
    }

    @Override // defpackage.amoe
    public final Object c(ConversationIdType conversationIdType, ffgu ffguVar) {
        return d(conversationIdType, ffel.a, false, ffguVar);
    }

    @Override // defpackage.amoe
    public final Object d(ConversationIdType conversationIdType, List list, boolean z, ffgu ffguVar) {
        Object b = this.h.b();
        b.getClass();
        return ffra.a(ekxi.a((ffhd) b), new amnz(null, this, z, list, conversationIdType), ffguVar);
    }

    @Override // defpackage.amoe
    public final boolean e(ConversationIdType conversationIdType) {
        return f(conversationIdType, ffel.a, false);
    }

    @Override // defpackage.amoe
    public final boolean f(ConversationIdType conversationIdType, List list, boolean z) {
        boolean z2;
        boolean z3;
        conversationIdType.getClass();
        list.getClass();
        efbd.b();
        if (!((cghm) this.e.b()).b()) {
            ensz enszVar = (ensz) a.h();
            enszVar.Y(csux.O, "ConversationTrustedContactsApi");
            enszVar.q("Devices not under supervision, conversation is always allowed.");
            return true;
        }
        if (!z) {
            return cggo.a(conversationIdType);
        }
        if (!((asnx) this.j.b()).a()) {
            ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(cggs.a((aoku) it.next()));
            }
            Collection values = g(ffdx.V(arrayList)).values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator it2 = values.iterator();
                while (it2.hasNext()) {
                    if (!((Boolean) it2.next()).booleanValue()) {
                        z2 = false;
                        break;
                    }
                }
            }
            z2 = true;
            if (!list.isEmpty()) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    if (!((aoku) it3.next()).v()) {
                        z3 = false;
                        break;
                    }
                }
            }
            z3 = true;
            return z2 || z3;
        }
        efbd.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(list, 10)), 16));
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            aoku aokuVar = (aoku) it4.next();
            linkedHashMap.put(aokuVar, aokuVar.l());
        }
        Map g = g(ffdx.ar(ffdx.aa(linkedHashMap.values())));
        if (linkedHashMap.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            aoku aokuVar2 = (aoku) entry.getKey();
            String str = (String) entry.getValue();
            if (str == null || str.length() == 0) {
                ensz enszVar2 = (ensz) a.j();
                enszVar2.Y(csux.O, "ConversationTrustedContactsApi");
                enszVar2.q("MessagingIdentity does not have a destination, default to not allowed by parents");
                return false;
            }
            if (g.get(str) == null) {
                ensz enszVar3 = (ensz) a.j();
                enszVar3.Y(csux.O, "ConversationTrustedContactsApi");
                enszVar3.q("A queried phone number is missing from the result returned by the ParentalControls API.");
                return false;
            }
            Boolean bool = (Boolean) g.get(str);
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            if (aokuVar2.u() || aokuVar2.B()) {
                return false;
            }
            if (!booleanValue && !aokuVar2.v() && !((bdtd) this.k.b()).l(aokuVar2)) {
                return false;
            }
        }
        return true;
    }
}
