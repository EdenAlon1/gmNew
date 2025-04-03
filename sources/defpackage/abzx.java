package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import android.text.TextUtils;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abzx implements Comparable<abzx>, Parcelable {
    public static final Parcelable.Creator<abzx> CREATOR = new abzu();
    public final String a;
    public final String b;
    public final engw c;
    public int d;

    public abzx(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.a = readString;
        String readString2 = parcel.readString();
        readString2.getClass();
        this.b = readString2;
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, abzw.CREATOR);
        this.c = engw.n(arrayList);
        this.d = parcel.readInt();
    }

    final int a() {
        return this.c.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final long b(int i) {
        return ((abzw) this.c.get(i)).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final Spanned c(int i) {
        return ((abzw) this.c.get(i)).c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(abzx abzxVar) {
        return ((abzw) this.c.get(0)).compareTo((abzw) abzxVar.c.get(0));
    }

    final void d(final boolean z) {
        Collection.EL.stream(this.c).forEach(new Consumer() { // from class: abzt
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((abzw) obj).e = z;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.d = z ? a() : 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean e(int i) {
        return ((abzw) this.c.get(i)).e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeTypedList(this.c);
        parcel.writeInt(this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public abzx(abwi abwiVar) {
        emxf.a(!abwiVar.a().isEmpty());
        this.a = ((abwh) abwiVar.a().get(0)).d();
        this.b = ((abwh) abwiVar.a().get(0)).c();
        engr engrVar = new engr();
        engw a = abwiVar.a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            abwh abwhVar = (abwh) a.get(i);
            emxf.b(abwhVar.e(), "ParticipantMessageList only supports incoming messages");
            emxf.i(TextUtils.equals(this.a, abwhVar.d()), "ParticipantMessageList only supports 1:1 conversations, normalizedDestination: %s | message.normalizedDestination: %s", cskt.b(this.a), cskt.b(abwhVar.d()));
            engrVar.h(new abzw(abwhVar));
        }
        engw D = engw.D(engrVar.g());
        this.c = D;
        this.d = D.size();
    }
}
