package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeqs extends fflr {
    final /* synthetic */ aerc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeqs(aerc aercVar) {
        super(null);
        this.a = aercVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        ViewGroup c;
        aeqk aeqkVar = (aeqk) obj2;
        aeqk aeqkVar2 = (aeqk) obj;
        if (aeqkVar2 != null && (c = this.a.c()) != null) {
            c.removeView(aeqkVar2.c().f);
        }
        if (aeqkVar != null) {
            final LayoutInflater from = LayoutInflater.from(this.a.c.fe());
            from.getClass();
            aerc aercVar = this.a;
            final ViewGroup c2 = aercVar.c();
            final boolean z = false;
            if (((Boolean) uky.g.e()).booleanValue() && ((Boolean) uky.k.e()).booleanValue()) {
                z = true;
            }
            aeqn c3 = aeqkVar.a != null ? aeqkVar.c() : aeqkVar.a(from, c2, z, new ffji() { // from class: aeqf
                @Override // defpackage.ffji
                public final Object invoke(Object obj3) {
                    ViewGroup viewGroup;
                    aeqn aeqnVar = (aeqn) obj3;
                    aeqnVar.getClass();
                    Context context = from.getContext();
                    context.getClass();
                    aeqnVar.i.setText(aeqk.f(context, R.string.google_photos_onboarding_text_body, R.string.google_photos_onboarding_text_body_photos_and_videos_xms));
                    if (!z && (viewGroup = c2) != null && viewGroup.getResources().getConfiguration().orientation == 1) {
                        aerl.a(aeqnVar.h);
                        aerl.a(aeqnVar.i);
                    }
                    return ffcu.a;
                }
            });
            c3.getClass();
            aeqkVar.a = c3;
            if (c2 != null) {
                c2.addView(aeqkVar.c().f);
            }
            aeqkVar.b = aercVar.i;
            aeqkVar.d(aerv.a);
            aeqkVar.c().g.setOnClickListener(new aeqt(aeqkVar, this.a));
            if (aeqkVar instanceof aeqj) {
                aeqj aeqjVar = (aeqj) aeqkVar;
                ((aeqm) aeqjVar.c()).a.setOnClickListener(new aequ(this.a, aeqkVar));
                ((aeqm) aeqjVar.c()).b.setOnClickListener(new aeqw(aeqkVar, this.a));
            } else if (aeqkVar instanceof aeqg) {
                aeqg aeqgVar = (aeqg) aeqkVar;
                ((aeqm) aeqgVar.c()).a.setOnClickListener(new aeqx(this.a, aeqkVar));
                ((aeqm) aeqgVar.c()).b.setOnClickListener(new aeqz(aeqkVar, this.a));
            } else {
                if (!(aeqkVar instanceof aeqi)) {
                    throw new ffcd();
                }
                ((aeql) ((aeqi) aeqkVar).c()).a.setOnClickListener(new aera(aeqkVar, this.a));
                aerc aercVar2 = this.a;
                axol.k(lks.a(aercVar2.c), null, new aerb(aercVar2, aeqkVar, null), 3);
            }
        }
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
