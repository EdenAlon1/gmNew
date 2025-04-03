package defpackage;

import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.Section;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dewf {
    public boolean a;
    public String c;
    private boolean d;
    private List e;
    private boolean f;
    public int b = 0;
    private final List g = new ArrayList();

    public final QuerySpecification a() {
        int[] iArr;
        boolean z = this.d;
        List list = this.e;
        boolean z2 = this.a;
        boolean z3 = this.f;
        int i = this.b;
        List list2 = this.g;
        int i2 = 0;
        if (list2.isEmpty()) {
            iArr = new int[0];
        } else {
            int[] iArr2 = new int[list2.size()];
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                iArr2[i2] = ((Integer) it.next()).intValue();
                i2++;
            }
            iArr = iArr2;
        }
        return new QuerySpecification(z, null, list, z2, 0, 0, z3, i, true, iArr, null, null, this.c, null);
    }

    public final void b() {
        this.d = true;
    }

    public final void c(Section section) {
        if (section.a.startsWith("semantic#")) {
            if (this.e == null) {
                this.f = true;
                this.e = new ArrayList();
            } else if (!this.f) {
                throw new IllegalArgumentException("Cannot mix literal and semantic sections");
            }
            this.e.add(section);
            return;
        }
        if (this.e == null) {
            this.f = false;
            this.e = new ArrayList();
        } else if (this.f) {
            throw new IllegalArgumentException("Cannot mix literal and semantic sections");
        }
        this.e.add(section);
    }
}
