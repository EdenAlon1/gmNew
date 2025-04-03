package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvu implements abwj {
    static final cfva a = cfvl.e(cfvl.b, "donation_max_conversation_count", Alert.DURATION_SHOW_INDEFINITELY);
    static final cfva b = cfvl.e(cfvl.b, "donation_max_messages_per_conversation", 10);
    static final cfva c = cfvl.i(cfvl.b, "donation_include_sent_messages", false);
    static final cfva d = cfvl.i(cfvl.b, "donation_include_personal_messages", false);
    static final cfva e = cfvl.i(cfvl.b, "donation_include_group_conversations", false);
    public static final cfup f = cfvl.c(cfvl.b, "donation_edit_distance_threshold", 0.1d);
    public static final cskc g = cskc.g("Bugle", "AllMessagesDonationConversationCollector");
    public final ffbr h;
    public final abwe i;
    private final errl j;

    public abvu(ffbr ffbrVar, errl errlVar, abwe abweVar) {
        this.h = ffbrVar;
        this.j = errlVar;
        this.i = abweVar;
    }

    @Override // defpackage.abwj
    public final elfl a(Bundle bundle) {
        abvv abvvVar = new abvv();
        abvvVar.c(((Boolean) d.e()).booleanValue());
        abvvVar.b();
        abvvVar.d(((Boolean) c.e()).booleanValue());
        abvvVar.e(((Double) f.e()).doubleValue());
        abvvVar.f(abxk.a());
        abvvVar.a = bundle;
        final abwc g2 = abvvVar.g();
        efbd.b();
        int intValue = ((Integer) a.e()).intValue();
        bsob e2 = bsom.e();
        e2.z("+AllMessagesDonationConversationCollector#getConversationIds");
        e2.c(bsom.c.a);
        if (!((Boolean) e.e()).booleanValue()) {
            e2.i(new Function() { // from class: abvt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsol bsolVar = (bsol) obj;
                    cfup cfupVar = abvu.f;
                    bsolVar.A();
                    return bsolVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        e2.r();
        final engw f2 = e2.b().f();
        enou enouVar = (enou) f2;
        int i = enouVar.c;
        g.m("Found " + i + " conversationIds");
        int min = Math.min(intValue, enouVar.c);
        final Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap(min));
        ArrayList arrayList = new ArrayList(min);
        for (final int i2 = 0; i2 < enouVar.c && i2 < intValue; i2++) {
            arrayList.add(elfo.f(new Runnable() { // from class: abvs
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    List list;
                    abwc abwcVar;
                    engw n;
                    List list2;
                    abwc abwcVar2;
                    abvu abvuVar;
                    HashMap hashMap;
                    abvx abvxVar = new abvx();
                    ConversationIdType conversationIdType = (ConversationIdType) f2.get(i2);
                    double intValue2 = ((Integer) abvu.b.e()).intValue();
                    abwc abwcVar3 = g2;
                    abvu abvuVar2 = abvu.this;
                    try {
                        int i3 = (int) (intValue2 * 1.5d);
                        list = ((abvw) abwcVar3).b ? ((bdmq) abvuVar2.h.b()).M(conversationIdType, i3) : ((bdmq) abvuVar2.h.b()).G(conversationIdType, i3);
                    } catch (Exception e3) {
                        csjb e4 = abvu.g.e();
                        e4.I("#getFullMessages: Failed to load messages for conversation");
                        e4.c(conversationIdType);
                        e4.s(e3);
                        list = null;
                    }
                    if (list == null) {
                        int i4 = engw.d;
                        n = enou.a;
                        abwcVar = abwcVar3;
                    } else {
                        ArrayList arrayList2 = new ArrayList(((Integer) abvu.b.e()).intValue());
                        ArrayList<engw> arrayList3 = new ArrayList(((Integer) abvu.b.e()).intValue());
                        HashMap hashMap2 = new HashMap();
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < list.size() && i6 < ((Integer) abvu.b.e()).intValue()) {
                            abwh a2 = abvuVar2.i.a(abwcVar3, (MessageCoreData) list.get(i5), hashMap2);
                            if (a2 != null) {
                                abwe abweVar = abvuVar2.i;
                                double d2 = ((abvw) abwcVar3).c;
                                if (d2 == eobe.a) {
                                    list2 = list;
                                    abwcVar2 = abwcVar3;
                                    abvuVar = abvuVar2;
                                    hashMap = hashMap2;
                                } else {
                                    engw a3 = abweVar.b.a(((abwa) a2).c.toString());
                                    for (engw engwVar : arrayList3) {
                                        list2 = list;
                                        abwcVar2 = abwcVar3;
                                        abwz abwzVar = abweVar.a;
                                        abvuVar = abvuVar2;
                                        hashMap = hashMap2;
                                        if (abwz.a(engwVar, a3)[engwVar.size()][((enou) a3).c] <= ((int) (Math.max(engwVar.size(), r0.c) * d2))) {
                                            break;
                                        }
                                        abwcVar3 = abwcVar2;
                                        list = list2;
                                        hashMap2 = hashMap;
                                        abvuVar2 = abvuVar;
                                    }
                                    list2 = list;
                                    abwcVar2 = abwcVar3;
                                    abvuVar = abvuVar2;
                                    hashMap = hashMap2;
                                    arrayList3.add(a3);
                                }
                                arrayList2.add(a2);
                                i6++;
                            } else {
                                list2 = list;
                                abwcVar2 = abwcVar3;
                                abvuVar = abvuVar2;
                                hashMap = hashMap2;
                            }
                            i5++;
                            abwcVar3 = abwcVar2;
                            list = list2;
                            hashMap2 = hashMap;
                            abvuVar2 = abvuVar;
                        }
                        abwcVar = abwcVar3;
                        n = engw.n(arrayList2);
                    }
                    if (n.isEmpty()) {
                        return;
                    }
                    if (!((Boolean) abvu.e.e()).booleanValue() || !((abvw) abwcVar).b) {
                        String d3 = ((abwh) n.get(0)).d();
                        for (int i7 = 1; i7 < n.size(); i7++) {
                            abwh abwhVar = (abwh) n.get(i7);
                            if (!((abvw) abwcVar).b && !abwhVar.e()) {
                                abvu.g.r("#conversationSatisfiesRequest: request excludes sent message but message was sent");
                                return;
                            } else {
                                if (!((Boolean) abvu.e.e()).booleanValue() && abwhVar.e() && !TextUtils.equals(d3, ((abwh) n.get(i7)).d())) {
                                    abvu.g.r("#conversationSatifiesRequest: request excludes group conversations, but single participant conversation had multiple incoming destinations");
                                    return;
                                }
                            }
                        }
                    }
                    Set set = newSetFromMap;
                    abvxVar.b(n);
                    set.add(abvxVar.c());
                }
            }, this.j));
        }
        return elfo.l(arrayList).a(new Callable() { // from class: abvr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cfup cfupVar = abvu.f;
                return engw.n(newSetFromMap);
            }
        }, this.j);
    }
}
