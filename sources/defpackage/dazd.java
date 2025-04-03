package defpackage;

import android.view.View;
import android.widget.AdapterView;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dazd implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ csfz a;
    final /* synthetic */ dazm b;

    public dazd(dazm dazmVar, csfz csfzVar) {
        this.a = csfzVar;
        this.b = dazmVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, final int i, long j) {
        final csfz csfzVar = this.a;
        elfo.f(new Runnable() { // from class: dazc
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                final boolean z = false;
                if (i2 != 1 && i2 == 2) {
                    z = true;
                }
                csfz csfzVar2 = csfzVar;
                dazd dazdVar = dazd.this;
                if (csfzVar2.equals(csfz.MULTI_DEVICE)) {
                    dazdVar.b.c.A(new Function() { // from class: axft
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            axep axepVar = (axep) obj;
                            cskc cskcVar = axkm.a;
                            axepVar.copyOnWrite();
                            axez axezVar = (axez) axepVar.instance;
                            axez axezVar2 = axez.a;
                            axezVar.b |= 2;
                            axezVar.e = z;
                            return axepVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                } else if (csfzVar2.equals(csfz.BACKUP_AND_RESTORE)) {
                    dazdVar.b.c.Z(z);
                }
            }
        }, this.b.d);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
