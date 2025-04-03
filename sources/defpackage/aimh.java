package defpackage;

import android.app.Activity;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aimh implements aigt {
    public final Activity a;
    public final eito b;
    private final Optional c;

    public aimh(Optional optional, Activity activity, eito eitoVar) {
        this.c = optional;
        this.a = activity;
        this.b = eitoVar;
    }

    @Override // defpackage.aigt
    public final /* bridge */ /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        final ffji ffjiVar = new ffji() { // from class: aimf
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                admk admkVar = (admk) obj;
                admkVar.getClass();
                aimh aimhVar = aimh.this;
                aimhVar.a.getIntent().putExtra("EXPRESS_SIGN_IN_FLOW_KEY", admj.g.j);
                admkVar.b(aimhVar.b);
                return ffcu.a;
            }
        };
        this.c.ifPresent(new Consumer() { // from class: aimg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ffji.this.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return ffcu.a;
    }
}
