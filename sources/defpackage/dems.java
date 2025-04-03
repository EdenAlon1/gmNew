package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dems {
    public static final String a(ffbr ffbrVar) {
        String a = ((deln) ffbrVar.b()).a();
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final adni b(final Activity activity, final ffbr ffbrVar, final ffbr ffbrVar2, final ffbr ffbrVar3, boolean z) {
        ebsi k = ebsj.k();
        ((ebsb) k).b = emux.a;
        k.c(new ebsr());
        if (z) {
            k.d(new ebst(activity.getString(R.string.app_name)));
        }
        adln adlnVar = new adln();
        adlnVar.a = k.e();
        adlnVar.d(new adnk() { // from class: demp
            @Override // defpackage.adnk
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return layoutInflater.inflate(R.layout.welcome_express_sign_in, viewGroup, false);
            }

            @Override // defpackage.adnk
            public final /* synthetic */ void b() {
            }
        });
        adlnVar.c(new Function() { // from class: demq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eisx eisxVar = (eisx) obj;
                dejk dejkVar = (dejk) ffbr.this.b();
                eisxVar.getClass();
                String a = dems.a(ffbrVar2);
                Intent intent = activity.getIntent();
                intent.getClass();
                dejkVar.a(eisxVar, a, dejo.a(intent), (cjtw) ((demu) ffbrVar3.b()).b.c());
                return null;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        adlnVar.b(new Function() { // from class: demr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eisx eisxVar = (eisx) obj;
                dejk dejkVar = (dejk) ffbr.this.b();
                eisxVar.getClass();
                Activity activity2 = activity;
                String a = dems.a(ffbrVar2);
                Intent intent = activity2.getIntent();
                intent.getClass();
                dejkVar.b(eisxVar, a, dejo.a(intent));
                return null;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return adlnVar.a();
    }
}
