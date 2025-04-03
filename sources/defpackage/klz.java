package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class klz {
    public boolean a;
    public final Bundle b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    private final IconCompat g;
    private final CharSequence h;
    private final PendingIntent i;
    private ArrayList j;

    public klz(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i != 0 ? IconCompat.i(null, "", i) : null, charSequence, pendingIntent, new Bundle());
    }

    public final kma a() {
        CharSequence[] charSequenceArr;
        if (this.e && this.i == null) {
            throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.j;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                kns knsVar = (kns) arrayList3.get(i);
                if (knsVar.d || (!((charSequenceArr = knsVar.c) == null || charSequenceArr.length == 0) || knsVar.g.isEmpty())) {
                    arrayList2.add(knsVar);
                } else {
                    arrayList.add(knsVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
        }
        return new kma(this.g, this.h, this.i, this.b, arrayList2.isEmpty() ? null : (kns[]) arrayList2.toArray(new kns[arrayList2.size()]), this.a, this.c, this.d, this.e, this.f);
    }

    public final void b(Bundle bundle) {
        if (bundle != null) {
            this.b.putAll(bundle);
        }
    }

    public final void c(kns knsVar) {
        if (this.j == null) {
            this.j = new ArrayList();
        }
        if (knsVar != null) {
            this.j.add(knsVar);
        }
    }

    public klz(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new Bundle());
    }

    private klz(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.a = true;
        this.d = true;
        this.g = iconCompat;
        this.h = kml.c(charSequence);
        this.i = pendingIntent;
        this.b = bundle;
        this.j = null;
        this.a = true;
        this.c = 0;
        this.d = true;
        this.e = false;
        this.f = false;
    }
}
