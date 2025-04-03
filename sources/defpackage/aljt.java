package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aljt {
    public final ffbr a;
    private final cpdg b;
    private final ctvb c;
    private final asvn d;

    public aljt(cpdg cpdgVar, ctvb ctvbVar, ffbr ffbrVar, asvn asvnVar) {
        this.b = cpdgVar;
        this.c = ctvbVar;
        this.a = ffbrVar;
        this.d = asvnVar;
    }

    public static int e(eooc eoocVar) {
        switch (eoocVar.ordinal()) {
            case 3:
                return 3;
            case 4:
            case 14:
            default:
                return 1;
            case 5:
                return 2;
            case 6:
                return 4;
            case 7:
                return 5;
            case 8:
                return 6;
            case 9:
                return 7;
            case 10:
                return 8;
            case 11:
                return 9;
            case 12:
                return 10;
            case 13:
                return 11;
            case 15:
                return 12;
        }
    }

    public static final int f(eooc eoocVar) {
        switch (eoocVar.ordinal()) {
            case 3:
                return 4;
            case 4:
            case 14:
            default:
                return 1;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
            case 8:
            case 9:
            case 10:
                return 3;
            case 11:
            case 12:
            case 13:
                return 5;
            case 15:
                return 2;
        }
    }

    public final engw a(engw engwVar) {
        if (engwVar.isEmpty()) {
            return engw.r(eooc.UNKNOWN_FORMAT);
        }
        final engr engrVar = new engr();
        Iterable$EL.forEach(engwVar, new Consumer() { // from class: aljs
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                aoku aokuVar = (aoku) obj;
                engrVar.h(aljt.this.b(aokuVar, aokuVar.B(), true));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return engrVar.g();
    }

    public final eooc b(aoku aokuVar, boolean z, boolean z2) {
        String j = z2 ? aokuVar.j() : aokuVar.o();
        if (this.d.a() && aokuVar.C()) {
            return aojl.a(j) ? eooc.SATELLITE_ESP : eooc.SATELLITE_ESP_DEMO;
        }
        if (emxe.c(j)) {
            return j == null ? eooc.UNKNOWN_FORMAT : eooc.EMPTY_STRING;
        }
        if (z) {
            return eooc.RBM_BOT;
        }
        if ("ʼWAP_PUSH_SI!ʼ".equals(j)) {
            return eooc.WAP_PUSH_SI;
        }
        cskc cskcVar = cpdg.a;
        if (aoqw.h(j)) {
            return eooc.EMAIL_ADDRESS;
        }
        cfva cfvaVar = aoqm.a;
        if (!((Boolean) new aopg().get()).booleanValue() ? !this.c.H(j) : !aokuVar.v()) {
            return eooc.EMERGENCY_NUMBER;
        }
        if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && aokuVar.A()) {
            return eooc.PENPAL_BOT;
        }
        if (aoqw.j(j)) {
            boolean contains = j.contains("+");
            boolean i = this.b.i(j);
            return contains ? i ? eooc.ALPHANUMERIC_SHORT_CODE_WITH_COUNTRY : eooc.DIGIT_SHORT_CODE_WITH_COUNTRY : i ? eooc.ALPHANUMERIC_SHORT_CODE_WITHOUT_COUNTRY : eooc.DIGIT_SHORT_CODE_WITHOUT_COUNTRY;
        }
        if (((Boolean) new aopz().get()).booleanValue()) {
            if (!aokuVar.z()) {
                return aokuVar.s() ? eooc.E164_FORMATTABLE_NATIONAL_PHONE_NUMBER : eooc.NON_E164_FORMATTABLE_LOCAL_NUMBER;
            }
        } else if (!this.c.L(j)) {
            try {
                return this.c.N(this.c.e(j, this.c.r())) == 1 ? eooc.E164_FORMATTABLE_NATIONAL_PHONE_NUMBER : eooc.NON_E164_FORMATTABLE_LOCAL_NUMBER;
            } catch (esfg unused) {
                return eooc.NON_E164_FORMATTABLE_LOCAL_NUMBER;
            }
        }
        return eooc.E164_PHONE_NUMBER;
    }

    public final eooc c(aoku aokuVar, boolean z) {
        return b(aokuVar, z, false);
    }

    @Deprecated
    public final List d(List list) {
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            arrayList.add(eooc.UNKNOWN_FORMAT);
            return arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
            arrayList.add(c(((aolr) this.a.b()).t(bindData), bdqv.d(bindData)));
        }
        return arrayList;
    }
}
