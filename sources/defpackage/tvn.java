package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.view.TouchDelegate;
import android.view.View;
import com.google.android.apps.messaging.conversation.badges.BadgesRecyclerView;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tvn {
    public final BadgesRecyclerView a;
    private final Map b;
    private final elbx c;
    private final tvf d;
    private final cuxh e;
    private ArrayList f;
    private tvm g;
    private boolean h = false;

    public tvn(BadgesRecyclerView badgesRecyclerView, Map map, elbx elbxVar, tvf tvfVar, cuxh cuxhVar) {
        this.a = badgesRecyclerView;
        this.b = map;
        this.c = elbxVar;
        this.d = tvfVar;
        this.e = cuxhVar;
    }

    public final void a(engw engwVar, enhk enhkVar) {
        Optional empty;
        this.a.getContext();
        View view = (View) this.a.getParent();
        if (!this.h) {
            this.g = new tvm(this.b, this.c, enhkVar);
            this.a.ap(new LinearLayoutManager(0));
            this.a.w(this.d);
            this.a.am(this.g);
            this.h = true;
        }
        tvm tvmVar = this.g;
        engw engwVar2 = tvmVar.a;
        if (engwVar2 == null || engwVar == null || engwVar2.isEmpty() || engwVar.isEmpty()) {
            empty = Optional.empty();
        } else if (engwVar2.size() > engwVar.size() + 1 || engwVar2.size() < engwVar.size() - 1) {
            empty = Optional.empty();
        } else if (engwVar2.size() == engwVar.size() - 1) {
            int i = 0;
            boolean z = false;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < engwVar2.size()) {
                    if (!((tux) engwVar2.get(i)).equals(engwVar.get(i + i2))) {
                        if (z) {
                            empty = Optional.empty();
                            break;
                        }
                        i2++;
                        i3 = i;
                        i--;
                        z = true;
                    }
                    i++;
                } else {
                    if (!z) {
                        i3 = engwVar2.size();
                    }
                    empty = Optional.of(new tuv(2, i3));
                }
            }
        } else if (engwVar2.size() == engwVar.size() + 1) {
            int i4 = 0;
            boolean z2 = false;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i4 >= engwVar2.size()) {
                    i4 = i6;
                    break;
                }
                if (i4 == engwVar.size()) {
                    if (!z2) {
                        break;
                    } else {
                        z2 = true;
                    }
                }
                if (!((tux) engwVar2.get(i4)).equals(engwVar.get(i4 + i5))) {
                    if (z2) {
                        empty = Optional.empty();
                        break;
                    } else {
                        i5--;
                        z2 = true;
                        i6 = i4;
                    }
                }
                i4++;
            }
            empty = Optional.of(new tuv(4, i4));
        } else {
            int i7 = 0;
            int i8 = -1;
            while (true) {
                if (i7 < engwVar2.size()) {
                    if (!((tux) engwVar2.get(i7)).equals(engwVar.get(i7))) {
                        if (i8 != -1) {
                            empty = Optional.empty();
                            break;
                        }
                        i8 = i7;
                    }
                    i7++;
                } else {
                    empty = i8 == -1 ? Optional.of(new tuv(1, -1)) : Optional.of(new tuv(3, i8));
                }
            }
        }
        tvmVar.a = engwVar;
        if (empty.isPresent()) {
            int i9 = ((tuv) empty.get()).b - 1;
            if (i9 == 1) {
                tvmVar.u(((tuv) empty.get()).a, 2);
            } else if (i9 == 2) {
                tvmVar.q(((tuv) empty.get()).a);
            } else if (i9 == 3) {
                tvmVar.y(((tuv) empty.get()).a);
            }
        } else {
            tvmVar.p();
        }
        if (engwVar.isEmpty()) {
            view.setTouchDelegate(null);
            this.a.setVisibility(8);
        } else {
            this.f = new ArrayList();
            ddwu.b(this.a, new Runnable() { // from class: tvi
                @Override // java.lang.Runnable
                public final void run() {
                    tvn.this.b();
                }
            });
            this.a.z(new tvj(this));
            this.a.setVisibility(0);
        }
    }

    public final void b() {
        View view = (View) this.a.getParent();
        if (view == null) {
            return;
        }
        dllc dllcVar = (dllc) view.getTouchDelegate();
        int i = 0;
        if (dllcVar != null) {
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                dllcVar.a.remove((View) this.f.get(i2));
            }
        }
        this.f.clear();
        int childCount = this.a.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            this.f.add(this.a.getChildAt(i3));
        }
        while (i < childCount) {
            View view2 = (View) this.f.get(i);
            View view3 = i > 0 ? (View) this.f.get(i - 1) : null;
            i++;
            View view4 = i < childCount ? (View) this.f.get(i) : null;
            TouchDelegate touchDelegate = this.e.d() ? new TouchDelegate(tvb.a(this.a, view2, view4, view3), view2) : new TouchDelegate(tvb.a(this.a, view2, view3, view4), view2);
            int i4 = dllc.c;
            view2.getClass();
            TouchDelegate touchDelegate2 = view.getTouchDelegate();
            dllc dllcVar2 = touchDelegate2 instanceof dllc ? (dllc) touchDelegate2 : new dllc(view, touchDelegate2);
            emxf.l(true);
            dllcVar2.a.put(view2, touchDelegate);
            if (touchDelegate == dllcVar2.b) {
                dllcVar2.b = null;
            }
            if (touchDelegate2 != dllcVar2) {
                view.setTouchDelegate(dllcVar2);
            }
        }
    }
}
