package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acex {
    public final List a;

    public acex(acfh acfhVar, acez acezVar, acff acffVar, acfd acfdVar, acfb acfbVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        Context context = (Context) acfhVar.a.b();
        context.getClass();
        arrayList.add(new acfg(context));
        Context context2 = (Context) acezVar.a.b();
        context2.getClass();
        arrayList.add(new acey(context2));
        Context context3 = (Context) acffVar.a.b();
        context3.getClass();
        arrayList.add(new acfe(context3));
        Context context4 = (Context) acfbVar.a.b();
        context4.getClass();
        arrayList.add(new acfa(context4));
        Context context5 = (Context) acfdVar.a.b();
        context5.getClass();
        arrayList.add(new acfc(context5));
    }
}
