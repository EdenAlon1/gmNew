package defpackage;

import com.google.android.ims.rcsservice.ims.ImsEvent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkom {
    public int a;
    public String b;
    public String c;
    public String d;
    public String e;

    public final ImsEvent a() {
        ImsEvent imsEvent = new ImsEvent(this.a, 0L);
        imsEvent.a = null;
        imsEvent.b = this.b;
        imsEvent.c = 0;
        imsEvent.e = this.c;
        imsEvent.d = this.d;
        imsEvent.f = this.e;
        return imsEvent;
    }
}
