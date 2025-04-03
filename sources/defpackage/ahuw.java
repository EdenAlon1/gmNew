package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.multishare.chip.ChipData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahuw implements ahuu {
    private static final cskc c = cskc.g("BugleMultiShare", "ChipTrackerImpl");
    public final LinkedHashMap a;
    public final Object b;
    private final Context d;
    private final ffbr e;
    private final fgcm f;
    private final cwos g;

    public ahuw(Context context, ffbr ffbrVar, cwos cwosVar, llv llvVar) {
        LinkedHashMap linkedHashMap;
        context.getClass();
        ffbrVar.getClass();
        cwosVar.getClass();
        llvVar.getClass();
        this.d = context;
        this.e = ffbrVar;
        this.g = cwosVar;
        this.b = new Object();
        Bundle bundle = (Bundle) llvVar.b("chip_bundle");
        if (bundle != null) {
            ArrayList<ChipData> parcelableArrayList = ctid.f ? bundle.getParcelableArrayList("identities", ChipData.class) : bundle.getParcelableArrayList("identities");
            linkedHashMap = new LinkedHashMap();
            if (parcelableArrayList != null) {
                for (ChipData chipData : parcelableArrayList) {
                    linkedHashMap.put(chipData.a, chipData);
                }
            }
        } else {
            List<ChipData> list = (List) llvVar.b("identities");
            linkedHashMap = new LinkedHashMap();
            if (list != null) {
                for (ChipData chipData2 : list) {
                    linkedHashMap.put(chipData2.a, chipData2);
                }
            }
        }
        this.a = linkedHashMap;
        Collection values = linkedHashMap.values();
        values.getClass();
        List ak = ffdx.ak(values);
        Set keySet = linkedHashMap.keySet();
        keySet.getClass();
        this.f = fgdm.a(new ahux(ak, engq.f(keySet), 12));
        llvVar.e("chip_bundle", new owu() { // from class: ahuv
            @Override // defpackage.owu
            public final Bundle a() {
                Bundle bundle2;
                ahuw ahuwVar = ahuw.this;
                synchronized (ahuwVar.b) {
                    Collection values2 = ahuwVar.a.values();
                    values2.getClass();
                    List ak2 = ffdx.ak(values2);
                    bundle2 = new Bundle();
                    bundle2.putParcelableArrayList("identities", new ArrayList<>(ak2));
                }
                return bundle2;
            }
        });
    }

    @Override // defpackage.ahuu
    public final ahut a() {
        return (ahut) this.f.c();
    }

    @Override // defpackage.ahuu
    public final ffxx b() {
        return this.f;
    }

    @Override // defpackage.ahuu
    public final void c(ChipData chipData) {
        chipData.getClass();
        synchronized (this.b) {
            ChipData chipData2 = null;
            if (((ChipData) this.a.get(chipData.a)) != null) {
                csjb c2 = c.c();
                c2.I("chip removed");
                c2.r();
                chipData2 = chipData;
                chipData = null;
            } else {
                if (this.a.size() > ((Number) this.e.b()).longValue()) {
                    cwos cwosVar = this.g;
                    String string = this.d.getString(R.string.multi_share_max_recipient_reached, this.e.b());
                    string.getClass();
                    cwosVar.a(string);
                    return;
                }
                this.a.put(chipData.a, chipData);
                csjb c3 = c.c();
                c3.I("chip added");
                c3.r();
            }
            fgcm fgcmVar = this.f;
            Collection values = this.a.values();
            values.getClass();
            List ak = ffdx.ak(values);
            Set keySet = this.a.keySet();
            keySet.getClass();
            fgcmVar.f(new ahux(ak, engq.f(keySet), chipData, chipData2));
        }
    }
}
