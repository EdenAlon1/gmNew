package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class cqru extends dtrr {
    public MessageIdType a;
    public String b;
    public cqtk c;
    public awvd d;
    public awvb e;
    public awvb f;
    public String g;
    public byte[] h;

    public cqru() {
        super(cqtj.g());
        this.a = bdhb.a;
    }

    public final cqrs a() {
        cqrt cqrtVar = new cqrt();
        cqrtVar.aC(aB());
        cqrtVar.a = this.a;
        cqrtVar.b = this.b;
        cqrtVar.c = this.c;
        cqrtVar.d = this.d;
        cqrtVar.e = this.e;
        cqrtVar.f = this.f;
        cqrtVar.g = this.g;
        cqrtVar.h = this.h;
        cqrtVar.cK = aC();
        return cqrtVar;
    }

    public final void b(awvb awvbVar) {
        int i = this.aB;
        if (i < 55030) {
            dtub.w("file_information", i);
        }
        aE(4);
        this.e = awvbVar;
    }

    public final void c(MessageIdType messageIdType) {
        aE(0);
        this.a = messageIdType;
    }

    public final void d(byte[] bArr) {
        int i = this.aB;
        if (i < 56040) {
            dtub.w("opaque_data", i);
        }
        aE(7);
        this.h = bArr;
    }

    public final void e(String str) {
        aE(1);
        this.b = str;
    }

    public final void f(cqtk cqtkVar) {
        aE(2);
        this.c = cqtkVar;
    }
}
