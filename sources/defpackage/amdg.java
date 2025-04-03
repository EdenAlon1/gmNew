package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class amdg {
    public static amdd p() {
        amcr amcrVar = new amcr();
        amcrVar.d(false);
        amcrVar.b(true);
        amcrVar.g(epdh.UNDEFINED);
        amcrVar.g = 1;
        amcrVar.h(8);
        return amcrVar;
    }

    public static amdd q(final buxr buxrVar, Optional optional) {
        final amdd p = p();
        r(new amdf() { // from class: amcx
            @Override // defpackage.amdf
            public final void a() {
                amdd.this.h(buxrVar.a());
            }
        }, optional, "missing terminal error status");
        r(new amdf() { // from class: amcy
            @Override // defpackage.amdf
            public final void a() {
                amdd.this.e(buxrVar.a.getAsInteger("raw_status").intValue());
            }
        }, optional, "missing raw telephony status");
        r(new amdf() { // from class: amcz
            @Override // defpackage.amdf
            public final void a() {
                Integer asInteger = buxrVar.a.getAsInteger("result_code");
                asInteger.intValue();
                ((amcr) amdd.this).a = Optional.of(asInteger);
            }
        }, optional, "missing resultCode");
        r(new amdf() { // from class: amda
            @Override // defpackage.amdf
            public final void a() {
                Integer asInteger = buxrVar.a.getAsInteger("sms_error_code");
                asInteger.intValue();
                ((amcr) amdd.this).b = Optional.of(asInteger);
            }
        }, optional, "missing errorCode");
        r(new amdf() { // from class: amdb
            @Override // defpackage.amdf
            public final void a() {
                amdd.this.d(buxrVar.a.getAsBoolean("seen").booleanValue());
            }
        }, optional, "missing notified");
        r(new amdf() { // from class: amdc
            @Override // defpackage.amdf
            public final void a() {
                ContentValues contentValues = buxrVar.a;
                byzl[] values = byzl.values();
                int intValue = contentValues.getAsInteger("xms_transport").intValue();
                if (intValue >= values.length) {
                    throw new IllegalArgumentException();
                }
                ((amcr) amdd.this).c = Optional.of(values[intValue]);
            }
        }, optional, "missing xmsTransport");
        return p;
    }

    private static void r(amdf amdfVar, Optional optional, final String str) {
        try {
            amdfVar.a();
        } catch (RuntimeException e) {
            optional.ifPresent(new Consumer() { // from class: amcw
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    csjb a = ((cskc) obj).a();
                    a.I(str);
                    a.s(e);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    public abstract int a();

    public abstract MessageIdType b();

    public abstract epdh c();

    public abstract Optional d();

    public abstract Optional e();

    public abstract Optional f();

    public abstract Optional g();

    public abstract Optional h();

    public abstract Optional i();

    public abstract Optional j();

    public abstract Optional k();

    public abstract Optional l();

    public abstract boolean m();

    public abstract boolean n();

    public abstract void o();
}
