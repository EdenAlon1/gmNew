package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.util.Pair;
import android.view.ContentInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ktm {
    public final ktk a;

    public ktm(ktk ktkVar) {
        this.a = ktkVar;
    }

    static ClipData c(ClipDescription clipDescription, List list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), (ClipData.Item) list.get(0));
        for (int i = 1; i < list.size(); i++) {
            clipData.addItem((ClipData.Item) list.get(i));
        }
        return clipData;
    }

    public static ktm g(ContentInfo contentInfo) {
        return new ktm(new ktj(contentInfo));
    }

    public final int a() {
        return this.a.a();
    }

    public final int b() {
        return this.a.b();
    }

    public final ClipData d() {
        return this.a.c();
    }

    public final Pair e(ksy ksyVar) {
        ClipData c = this.a.c();
        if (c.getItemCount() == 1) {
            boolean b = ksyVar.b(c.getItemAt(0));
            return Pair.create(true != b ? null : this, true != b ? this : null);
        }
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i = 0; i < c.getItemCount(); i++) {
            ClipData.Item itemAt = c.getItemAt(i);
            if (ksyVar.b(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        Pair create = arrayList == null ? Pair.create(null, c) : arrayList2 == null ? Pair.create(c, null) : Pair.create(c(c.getDescription(), arrayList), c(c.getDescription(), arrayList2));
        if (create.first == null) {
            return Pair.create(null, this);
        }
        if (create.second == null) {
            return Pair.create(this, null);
        }
        kth ktgVar = Build.VERSION.SDK_INT >= 31 ? new ktg(this) : new kti(this);
        ktf.b((ClipData) create.first, ktgVar);
        ktm a = ktf.a(ktgVar);
        kth ktgVar2 = Build.VERSION.SDK_INT >= 31 ? new ktg(this) : new kti(this);
        ktf.b((ClipData) create.second, ktgVar2);
        return Pair.create(a, ktf.a(ktgVar2));
    }

    public final ContentInfo f() {
        ContentInfo f = this.a.f();
        f.getClass();
        return f;
    }

    public final String toString() {
        return this.a.toString();
    }
}
