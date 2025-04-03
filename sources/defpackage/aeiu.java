package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.banner.HomeBannerView;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeiu extends vk implements aefj {
    public final Optional a;
    private final ffbr d;

    public aeiu(Optional optional, ffbr ffbrVar) {
        this.a = optional;
        this.d = ffbrVar;
    }

    @Override // defpackage.vk
    public final int a() {
        if (this.a.isEmpty()) {
            return 0;
        }
        aeeu aeeuVar = (aeeu) this.a.get();
        return (aeeuVar.i && aeeuVar.h) ? 1 : 0;
    }

    @Override // defpackage.aefj
    public final void b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            emxf.a(1 == a());
            s(0);
        } else if (i2 != 1) {
            emxf.a(1 == a());
            q(0);
        } else {
            emxf.a(1 == (a() ^ 1));
            y(0);
        }
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        return 2;
    }

    @Override // defpackage.vk
    public final wr e(ViewGroup viewGroup, int i) {
        this.a.isPresent();
        emxf.m(true, "Tried to create prefix ViewHolder when no home banner host was present");
        return new aehv(LayoutInflater.from(viewGroup.getContext()).inflate(true != ((auyb) ((aeeu) this.a.get()).d.b()).a() ? R.layout.banner_view_v3 : R.layout.banner_view_coolranch, viewGroup, false));
    }

    @Override // defpackage.vk
    public final void g(wr wrVar, int i) {
        int i2 = engw.d;
        z(wrVar, i, enou.a);
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        return 2147483646L;
    }

    @Override // defpackage.vk
    public final void z(wr wrVar, int i, List list) {
        if (i < a()) {
            this.a.isPresent();
            elav a = ((ekyo) this.d.b()).a("ConversationListPrefixAdapter#onBindViewHolder");
            try {
                Object obj = this.a.get();
                View view = wrVar.a;
                if (((aeeu) obj).i) {
                    final aefn H = ((HomeBannerView) view).H();
                    final aefb aefbVar = ((aeeu) obj).f;
                    aefbVar.k();
                    H.c.setImageResource(aefbVar.a());
                    H.g.setText(aefbVar.f());
                    H.g.setOnClickListener(new elay(H.a, "HomeBannerViewPeer#onNegativeButtonClick", new View.OnClickListener() { // from class: aefl
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            aefbVar.c().a(aefn.this.b, view2);
                        }
                    }));
                    if (aefbVar.h() != null) {
                        H.d.setText(aefbVar.h());
                        H.d.setVisibility(0);
                    } else {
                        H.d.setVisibility(8);
                    }
                    if (aefbVar.e() != null) {
                        H.e.setText(aefbVar.e());
                        H.e.setVisibility(0);
                    } else {
                        H.e.setVisibility(8);
                    }
                    if (aefbVar.g() != null) {
                        H.f.setText(aefbVar.g());
                        H.f.setOnClickListener(new elay(H.a, "HomeBannerViewPeer#onPositiveButtonClick", new View.OnClickListener() { // from class: aefm
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                aefa d = aefbVar.d();
                                d.getClass();
                                d.a(aefn.this.b, view2);
                            }
                        }));
                        H.f.setVisibility(0);
                    } else {
                        H.f.setVisibility(8);
                    }
                    aefbVar.b().q();
                }
                a.close();
            } catch (Throwable th) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
