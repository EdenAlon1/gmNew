package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwiv implements cwis {
    private static final cskc d = cskc.g("BugleContacts", "ContactSelectionTrackerImpl");
    public final LinkedHashMap a;
    public final Object b;
    public cwjb c;
    private final fgcm e;

    public cwiv(llv llvVar) {
        llvVar.getClass();
        this.b = new Object();
        Bundle bundle = (Bundle) llvVar.b("contact_selection_bundle");
        Integer num = (Integer) llvVar.b("selection_mode");
        if (bundle != null) {
            this.c = cwja.a(bundle.getInt("selection_mode"));
            ArrayList<ChipData> b = ctid.f ? ih.b(bundle, "identities", ChipData.class) : bundle.getParcelableArrayList("identities");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (b != null) {
                for (ChipData chipData : b) {
                    linkedHashMap.put(chipData.a, chipData);
                }
            }
            this.a = linkedHashMap;
            h("initial mode from bundle: ");
        } else if (num != null) {
            Integer num2 = (Integer) llvVar.b("selection_mode");
            this.c = cwja.a(num2 != null ? num2.intValue() : cwjb.a.ordinal());
            List<ChipData> list = (List) llvVar.b("identities");
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (list != null) {
                for (ChipData chipData2 : list) {
                    linkedHashMap2.put(chipData2.a, chipData2);
                }
            }
            this.a = linkedHashMap2;
            h("initial mode from defaultMode: ");
        } else {
            this.c = ((Boolean) cvqt.b.e()).booleanValue() ? cwjb.c : cwjb.a;
            this.a = new LinkedHashMap();
            h("initial mode: ");
        }
        Collection values = this.a.values();
        values.getClass();
        List ak = ffdx.ak(values);
        Set keySet = this.a.keySet();
        keySet.getClass();
        this.e = fgdm.a(new cwir(ak, engq.f(keySet), null, null, this.c));
        llvVar.e("contact_selection_bundle", new owu() { // from class: cwit
            @Override // defpackage.owu
            public final Bundle a() {
                Bundle bundle2;
                cwiv cwivVar = cwiv.this;
                synchronized (cwivVar.b) {
                    cwjb cwjbVar = cwivVar.c;
                    Collection values2 = cwivVar.a.values();
                    values2.getClass();
                    List ak2 = ffdx.ak(values2);
                    cwjbVar.getClass();
                    bundle2 = new Bundle();
                    bundle2.putInt("selection_mode", cwjbVar.ordinal());
                    if (cwjbVar != cwjb.a) {
                        bundle2.putParcelableArrayList("identities", new ArrayList<>(ak2));
                    }
                }
                return bundle2;
            }
        });
    }

    private final void h(String str) {
        csjb c = d.c();
        c.I(str);
        c.I(this.c);
        c.I("selected count: ");
        c.G(this.a.size());
        c.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(ChipData chipData, ChipData chipData2) {
        Collection values = this.a.values();
        values.getClass();
        List ak = ffdx.ak(values);
        Set keySet = this.a.keySet();
        keySet.getClass();
        this.e.f(new cwir(ak, engq.f(keySet), chipData, chipData2, this.c));
    }

    @Override // defpackage.cwis
    public final ffxx a() {
        return this.e;
    }

    @Override // defpackage.cwis
    public final void b() {
        synchronized (this.b) {
            if (this.c == cwjb.a && !this.a.isEmpty()) {
                d.p("clearing 1-1 selection on resume");
                f();
                i(null, null);
            }
        }
    }

    @Override // defpackage.cwis
    public final void c(ChipData chipData) {
        chipData.getClass();
        synchronized (this.b) {
            ChipData chipData2 = (ChipData) this.a.get(chipData.a);
            if (chipData2 != null && chipData2.e) {
                csjb c = d.c();
                c.p(chipData.a);
                c.I("preselected contact clicked");
                c.r();
                return;
            }
            ChipData chipData3 = null;
            if (chipData2 != null) {
                csjb c2 = d.c();
                c2.p(chipData.a);
                c2.I("removing selection chip");
                c2.r();
                this.a.remove(chipData.a);
                chipData3 = chipData;
                chipData = null;
            } else {
                csjb c3 = d.c();
                c3.p(chipData.a);
                c3.I("adding selection chip");
                c3.r();
                this.a.put(chipData.a, chipData);
            }
            i(chipData, chipData3);
        }
    }

    @Override // defpackage.cwis
    public final void d(cwjb cwjbVar) {
        cwjbVar.getClass();
        synchronized (this.b) {
            cwjb cwjbVar2 = this.c;
            if (cwjbVar != cwjbVar2) {
                cwjb cwjbVar3 = cwjb.a;
                if ((cwjbVar2 != cwjbVar3 || cwjbVar != cwjb.b) && (cwjbVar2 != cwjb.b || cwjbVar != cwjbVar3)) {
                    throw new IllegalStateException("Check failed.");
                }
                if (cwjbVar == cwjbVar3) {
                    f();
                }
                d.p("changing selection mode from " + this.c + " to " + cwjbVar);
                this.c = cwjbVar;
                i(null, null);
            }
        }
    }

    @Override // defpackage.cwis
    public final cwir e() {
        return (cwir) this.e.c();
    }

    public final void f() {
        Set entrySet = this.a.entrySet();
        entrySet.getClass();
        ffdx.y(entrySet, new ffji() { // from class: cwiu
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                entry.getValue().getClass();
                return Boolean.valueOf(!((ChipData) r1).e);
            }
        });
    }
}
