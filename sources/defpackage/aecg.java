package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewStub;
import com.google.android.apps.messaging.R;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aecg extends wc {
    final /* synthetic */ aedh a;

    public aecg(aedh aedhVar) {
        this.a = aedhVar;
    }

    @Override // defpackage.wc
    public final void a(RecyclerView recyclerView, int i, int i2) {
        ekzm b = this.a.F.b("HomeFragmentPeer#onScrolled");
        try {
            aedh aedhVar = this.a;
            if (aedhVar.aX) {
                if (aedhVar.F()) {
                    ekzz f = eleg.f("HomeFragment#onScrollToNewest");
                    try {
                        this.a.x();
                        f.close();
                    } finally {
                    }
                } else {
                    ((bcrh) this.a.aU.a()).d(false);
                }
                if (((Boolean) aeek.a.e()).booleanValue() || ((aubd) this.a.bw.b()).a()) {
                    ((Optional) this.a.S.b()).ifPresent(new Consumer() { // from class: aecf
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            aecg aecgVar = aecg.this;
                            int L = aecgVar.a.aO.L();
                            if (L == 0 || L == -1) {
                                if (aedh.d(aecgVar.a.b) != null) {
                                    aedh.d(aecgVar.a.b).setVisibility(8);
                                    return;
                                }
                                return;
                            }
                            if (aedh.d(aecgVar.a.b) == null) {
                                final aedh aedhVar2 = aecgVar.a;
                                ViewStub viewStub = (ViewStub) aedh.f(aedhVar2.b).findViewById(R.id.go_to_top_stub);
                                viewStub.setLayoutResource(R.layout.go_to_top_view);
                                viewStub.inflate().setOnClickListener(new View.OnClickListener() { // from class: aeba
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        aedh aedhVar3 = aedh.this;
                                        aedh.b(aedhVar3.b).au(0);
                                        AppBarLayout appBarLayout = aedhVar3.bD.c;
                                        if (appBarLayout == null || aedhVar3.C()) {
                                            return;
                                        }
                                        appBarLayout.m(true);
                                    }
                                });
                                aedh.e(aedhVar2.b).requestApplyInsets();
                            }
                            aedh.d(aecgVar.a.b).setVisibility(0);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.wc
    public final void b(RecyclerView recyclerView, int i) {
    }
}
