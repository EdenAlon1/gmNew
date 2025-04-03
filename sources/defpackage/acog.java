package defpackage;

import com.google.android.apps.messaging.dittosatellite.impl.DittoWebActivity;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acog extends acoh {
    public static final cfva a = cfvl.r(188802598, "block_create_if_feature_disabled");
    public static final cskc b = cskc.g("Bugle", "DittoWebActivityPeer");
    public final DittoWebActivity c;
    public final ffbr d;
    public final ffbr e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;

    public acog(DittoWebActivity dittoWebActivity, fazb fazbVar, ffbr ffbrVar, fazb fazbVar2, fazb fazbVar3, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.c = dittoWebActivity;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.h = ffbrVar3;
        this.g = ffbrVar4;
        this.i = ffbrVar5;
        final eito eitoVar = (eito) fazbVar.b();
        eiwy e = eiwz.e(dittoWebActivity);
        e.d(acnf.class);
        eitoVar.g(e.a());
        eitoVar.e((eivv) fazbVar2.b());
        acnh acnhVar = (acnh) fazbVar3.b();
        acnhVar.a.set(new Runnable() { // from class: acoe
            @Override // java.lang.Runnable
            public final void run() {
                final acog acogVar = acog.this;
                Optional optional = (Optional) acogVar.h.b();
                final eito eitoVar2 = eitoVar;
                optional.ifPresent(new Consumer() { // from class: acod
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        acog.this.c.getIntent().putExtra("EXPRESS_SIGN_IN_FLOW_KEY", admj.f.j);
                        ((admk) obj).b(eitoVar2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        });
    }

    public static boolean a(DittoWebActivity dittoWebActivity) {
        return (dittoWebActivity.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
