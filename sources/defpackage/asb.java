package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asb implements ayb {
    private final apu f;
    public int e = 0;
    public final Map b = new HashMap();
    public Set d = new HashSet();
    public final List a = new ArrayList();
    public List c = new ArrayList();

    public asb(apu apuVar) {
        this.f = apuVar;
        Set hashSet = new HashSet();
        try {
            hashSet = apuVar.a.b();
        } catch (aog unused) {
            avw.c("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList((Set) it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                try {
                    if (akg.a(this.f, str) && akg.a(this.f, str2)) {
                        this.d.add(new HashSet(Arrays.asList(str, str2)));
                        if (!this.b.containsKey(str)) {
                            this.b.put(str, new ArrayList());
                        }
                        if (!this.b.containsKey(str2)) {
                            this.b.put(str2, new ArrayList());
                        }
                        ((List) this.b.get(str)).add((String) arrayList.get(1));
                        ((List) this.b.get(str2)).add((String) arrayList.get(0));
                    }
                } catch (avv unused2) {
                    avw.a("Camera2CameraCoordinator", a.d(str2, str, "Concurrent camera id pair: (", ", ", ") is not backward compatible"));
                }
            }
        }
    }

    @Override // defpackage.ayb
    public final void a(String str) {
        bgl bglVar;
        if (this.b.containsKey(str)) {
            for (String str2 : (List) this.b.get(str)) {
                for (ati atiVar : this.c) {
                    if (atiVar instanceof ajw) {
                        throw null;
                    }
                    bcq e = ((bcq) atiVar).e();
                    ksw.b(e instanceof ahv, "CameraInfo doesn't contain Camera2 implementation.");
                    asj asjVar = ((ahv) e).c;
                    if ((atiVar instanceof bba) && (bglVar = ((bba) atiVar).a) != null) {
                        ahv ahvVar = asjVar.a;
                        bglVar.n();
                        asjVar = new asj(ahvVar);
                    }
                    if (str2.equals(asjVar.a.a)) {
                        return;
                    }
                }
            }
        }
    }
}
