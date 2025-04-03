package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tvm extends vk {
    public engw a;
    private final Map d;
    private final elbx e;
    private final enhk f;

    public tvm(Map map, elbx elbxVar, enhk enhkVar) {
        this.d = map;
        this.e = elbxVar;
        this.f = enhkVar;
    }

    @Override // defpackage.vk
    public final int a() {
        engw engwVar = this.a;
        if (engwVar == null) {
            return 0;
        }
        return engwVar.size();
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        engw engwVar = this.a;
        engwVar.getClass();
        emxf.a(i < engwVar.size());
        return ((tux) this.a.get(i)).a().g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vk
    public final wr e(ViewGroup viewGroup, int i) {
        final tve tveVar;
        tve tveVar2 = tve.REACTION_BADGE;
        if (i == 0) {
            tveVar = tve.REACTION_BADGE;
        } else if (i == 1) {
            tveVar = tve.CUSTOM_REACTION_BADGE;
        } else if (i == 2) {
            tveVar = tve.STAR_BADGE;
        } else if (i == 3) {
            tveVar = tve.CALENDAR_BADGE;
        } else if (i == 4) {
            tveVar = tve.SCHEDULED_SEND_BADGE;
        } else {
            if (i != 5) {
                throw new IllegalArgumentException("No BadgeViewType corresponding to value " + i);
            }
            tveVar = tve.REMINDER_BADGE;
        }
        emxf.a(this.d.containsKey(tveVar));
        tvc tvcVar = (tvc) this.d.get(tveVar);
        tvcVar.getClass();
        wr a = tvcVar.a(viewGroup);
        tvr tvrVar = (tvr) a;
        tve a2 = tvrVar.a();
        tve a3 = tvrVar.a();
        if (a2 != tveVar) {
            throw new emyx(emyk.a("Expected to create a badge of type %s, but was %s.", tveVar, a3));
        }
        View view = a.a;
        final ViewParent parent = view.getParent();
        if (parent != null) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: tvl
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    ViewParent viewParent = parent;
                    if (motionEvent.getAction() == 0) {
                        viewParent.getParent().requestDisallowInterceptTouchEvent(true);
                    } else if (motionEvent.getAction() == 1) {
                        viewParent.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    return false;
                }
            });
        }
        final tuw tuwVar = (tuw) this.f.get(tveVar);
        if (tuwVar != null) {
            a.a.setOnClickListener(new elay(this.e, "BadgesRecyclerView#onBadgeClick", new View.OnClickListener() { // from class: tvk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    tuw.this.a(view2, tveVar);
                }
            }));
        }
        return a;
    }

    @Override // defpackage.vk
    public final void g(wr wrVar, int i) {
        engw engwVar = this.a;
        engwVar.getClass();
        emxf.a(i < engwVar.size());
        ((tux) this.a.get(i)).b(wrVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vk
    public final void k(wr wrVar) {
        ((tvr) wrVar).b();
    }
}
