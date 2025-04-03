package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deuh extends vy implements Parcelable {
    public static final Parcelable.Creator<deuh> CREATOR = new deug();
    public float a;
    public float b;
    public int g;
    public float h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;

    public deuh() {
        super(-2, -2);
        this.a = 0.0f;
        this.b = 1.0f;
        this.g = -1;
        this.h = -1.0f;
        this.k = 16777215;
        this.l = 16777215;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeInt(this.g);
        parcel.writeFloat(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.bottomMargin);
        parcel.writeInt(this.leftMargin);
        parcel.writeInt(this.rightMargin);
        parcel.writeInt(this.topMargin);
        parcel.writeInt(this.height);
        parcel.writeInt(this.width);
    }

    public deuh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0.0f;
        this.b = 1.0f;
        this.g = -1;
        this.h = -1.0f;
        this.k = 16777215;
        this.l = 16777215;
    }

    protected deuh(Parcel parcel) {
        super(-2, -2);
        this.a = 0.0f;
        this.b = 1.0f;
        this.g = -1;
        this.h = -1.0f;
        this.k = 16777215;
        this.l = 16777215;
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
        this.g = parcel.readInt();
        this.h = parcel.readFloat();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readByte() != 0;
        this.bottomMargin = parcel.readInt();
        this.leftMargin = parcel.readInt();
        this.rightMargin = parcel.readInt();
        this.topMargin = parcel.readInt();
        this.height = parcel.readInt();
        this.width = parcel.readInt();
    }
}
