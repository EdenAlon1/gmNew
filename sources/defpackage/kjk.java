package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kjk implements kji {
    final kjv d;
    int e;
    public int f;
    public kji a = null;
    public boolean b = false;
    public boolean c = false;
    int l = 1;
    int g = 1;
    kjl h = null;
    public boolean i = false;
    final List j = new ArrayList();
    final List k = new ArrayList();

    public kjk(kjv kjvVar) {
        this.d = kjvVar;
    }

    public final void a(kji kjiVar) {
        this.j.add(kjiVar);
        if (this.i) {
            kjiVar.f();
        }
    }

    public final void b() {
        this.k.clear();
        this.j.clear();
        this.i = false;
        this.f = 0;
        this.c = false;
        this.b = false;
    }

    public void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((kji) it.next()).f();
        }
    }

    @Override // defpackage.kji
    public final void f() {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            if (!((kjk) it.next()).i) {
                return;
            }
        }
        this.c = true;
        kji kjiVar = this.a;
        if (kjiVar != null) {
            kjiVar.f();
        }
        if (this.b) {
            this.d.f();
            return;
        }
        int i = 0;
        kjk kjkVar = null;
        for (kjk kjkVar2 : this.k) {
            if (!(kjkVar2 instanceof kjl)) {
                i++;
                kjkVar = kjkVar2;
            }
        }
        if (kjkVar != null && i == 1 && kjkVar.i) {
            kjl kjlVar = this.h;
            if (kjlVar != null) {
                if (!kjlVar.i) {
                    return;
                } else {
                    this.e = this.g * kjlVar.f;
                }
            }
            c(kjkVar.f + this.e);
        }
        kji kjiVar2 = this.a;
        if (kjiVar2 != null) {
            kjiVar2.f();
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.d.as);
        sb.append(":");
        switch (this.l) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = GeneralPurposeRichCardLayoutInfo.IMAGE_ALIGNMENT_LEFT;
                break;
            case 5:
                str = GeneralPurposeRichCardLayoutInfo.IMAGE_ALIGNMENT_RIGHT;
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append((Object) str);
        sb.append("(");
        sb.append(this.i ? Integer.valueOf(this.f) : "unresolved");
        sb.append(") <t=");
        sb.append(this.k.size());
        sb.append(":d=");
        sb.append(this.j.size());
        sb.append(">");
        return sb.toString();
    }
}
