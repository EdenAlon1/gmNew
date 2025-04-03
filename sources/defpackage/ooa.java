package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ooa extends vk implements ong {
    public List a;
    private final PreferenceGroup d;
    private List e;
    private final List f;
    private final Runnable h = new onx(this);
    private final Handler g = new Handler(Looper.getMainLooper());

    public ooa(PreferenceGroup preferenceGroup) {
        this.d = preferenceGroup;
        preferenceGroup.C = this;
        this.e = new ArrayList();
        this.a = new ArrayList();
        this.f = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            B(((PreferenceScreen) preferenceGroup).e);
        } else {
            B(true);
        }
        F();
    }

    private final List G(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int k = preferenceGroup.k();
        int i = 0;
        for (int i2 = 0; i2 < k; i2++) {
            Preference o = preferenceGroup.o(i2);
            if (o.w) {
                if (!I(preferenceGroup) || i < preferenceGroup.d) {
                    arrayList.add(o);
                } else {
                    arrayList2.add(o);
                }
                if (o instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) o;
                    if (!preferenceGroup2.ad()) {
                        continue;
                    } else {
                        if (I(preferenceGroup) && I(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : G(preferenceGroup2)) {
                            if (!I(preferenceGroup) || i < preferenceGroup.d) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (I(preferenceGroup) && i > preferenceGroup.d) {
            omt omtVar = new omt(preferenceGroup.j, arrayList2, preferenceGroup.eS());
            omtVar.o = new ony(this, preferenceGroup);
            arrayList.add(omtVar);
        }
        return arrayList;
    }

    private final void H(List list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.b);
        }
        int k = preferenceGroup.k();
        for (int i = 0; i < k; i++) {
            Preference o = preferenceGroup.o(i);
            list.add(o);
            onz onzVar = new onz(o);
            if (!this.f.contains(onzVar)) {
                this.f.add(onzVar);
            }
            if (o instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) o;
                if (preferenceGroup2.ad()) {
                    H(list, preferenceGroup2);
                }
            }
            o.C = this;
        }
    }

    private static final boolean I(PreferenceGroup preferenceGroup) {
        return preferenceGroup.d != Integer.MAX_VALUE;
    }

    final void F() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).C = null;
        }
        ArrayList arrayList = new ArrayList(this.e.size());
        this.e = arrayList;
        H(arrayList, this.d);
        this.a = G(this.d);
        oof oofVar = this.d.k;
        p();
        for (Preference preference : this.e) {
        }
    }

    @Override // defpackage.vk
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.ong
    public final void b() {
        this.g.removeCallbacks(this.h);
        this.g.post(this.h);
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        onz onzVar = new onz(m(i));
        int indexOf = this.f.indexOf(onzVar);
        if (indexOf != -1) {
            return indexOf;
        }
        List list = this.f;
        int size = list.size();
        list.add(onzVar);
        return size;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        onz onzVar = (onz) this.f.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, ooj.a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = ku.a(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(onzVar.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            inflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = onzVar.b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new ooi(inflate);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        ooi ooiVar = (ooi) wrVar;
        View view = ooiVar.a;
        Preference m = m(i);
        Drawable background = view.getBackground();
        Drawable drawable = ooiVar.s;
        if (background != drawable) {
            ooiVar.a.setBackground(drawable);
        }
        TextView textView = (TextView) ooiVar.C(R.id.title);
        if (textView != null && ooiVar.t != null && !textView.getTextColors().equals(ooiVar.t)) {
            textView.setTextColor(ooiVar.t);
        }
        m.a(ooiVar);
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        if (this.b) {
            return m(i).eS();
        }
        return -1L;
    }

    public final Preference m(int i) {
        if (i < 0 || i >= a()) {
            return null;
        }
        return (Preference) this.a.get(i);
    }
}
