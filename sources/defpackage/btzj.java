package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btzj extends dtrr {
    public String a;
    public MessageIdType b;
    public int c;
    public buax d;
    public buay e;
    public String f;
    public String g;

    public btzj() {
        super(buaw.e());
        this.b = bdhb.a;
        this.f = "";
        this.g = "";
    }

    public final btzh a() {
        btzi btziVar = new btzi();
        btziVar.aC(aB());
        String str = this.f;
        if (str == null) {
            throw new IllegalStateException("field intent cannot be null");
        }
        String str2 = this.g;
        if (str2 == null) {
            throw new IllegalStateException("field model_id cannot be null");
        }
        btziVar.a = this.a;
        btziVar.b = this.b;
        btziVar.c = this.c;
        btziVar.d = this.d;
        btziVar.e = this.e;
        btziVar.f = str;
        btziVar.g = str2;
        btziVar.cK = aC();
        return btziVar;
    }

    public final void b(buax buaxVar) {
        int i = this.aB;
        if (i < 53060) {
            dtub.w("confidence", i);
        }
        aE(3);
        this.d = buaxVar;
    }

    public final void c(String str) {
        int i = this.aB;
        if (i < 58590) {
            dtub.w("intent", i);
        }
        aE(5);
        this.f = str;
    }

    public final void d(int i) {
        aE(2);
        this.c = i;
    }

    public final void e(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void f(String str) {
        aE(6);
        this.g = str;
    }

    public final void g(buay buayVar) {
        aE(4);
        this.e = buayVar;
    }
}
