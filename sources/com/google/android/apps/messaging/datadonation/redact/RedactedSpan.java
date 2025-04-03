package com.google.android.apps.messaging.datadonation.redact;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import defpackage.abxn;
import defpackage.abxo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RedactedSpan implements Parcelable {
    public static final Parcelable.Creator<RedactedSpan> CREATOR = new abxn();
    public final abxo a;

    public RedactedSpan(abxo abxoVar) {
        this.a = abxoVar;
    }

    public static SpannableStringBuilder a(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(readString);
        int readInt = parcel.readInt();
        while (readInt != -1) {
            spannableStringBuilder.setSpan(new RedactedSpan(abxo.a(readInt)), parcel.readInt(), parcel.readInt(), 17);
            readInt = parcel.readInt();
        }
        return spannableStringBuilder;
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, abxo abxoVar, String str) {
        int i;
        SpannableString spannableString = new SpannableString(spannableStringBuilder);
        if (abxoVar == abxo.EMAIL) {
            i = 2;
        } else {
            if (abxoVar != abxo.URL) {
                throw new IllegalArgumentException();
            }
            i = 1;
        }
        Linkify.addLinks(spannableString, i);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        int length = uRLSpanArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            URLSpan uRLSpan = uRLSpanArr[length];
            int spanStart = spannableString.getSpanStart(uRLSpan);
            spannableStringBuilder.replace(spanStart, spannableString.getSpanEnd(uRLSpan), (CharSequence) str);
            spannableStringBuilder.setSpan(new RedactedSpan(abxoVar), spanStart, str.length() + spanStart, 17);
        }
    }

    public static void c(Parcel parcel, Spanned spanned) {
        parcel.writeString(spanned.toString());
        for (RedactedSpan redactedSpan : (RedactedSpan[]) spanned.getSpans(0, spanned.length(), RedactedSpan.class)) {
            parcel.writeInt(redactedSpan.a.d);
            parcel.writeInt(spanned.getSpanStart(redactedSpan));
            parcel.writeInt(spanned.getSpanEnd(redactedSpan));
        }
        parcel.writeInt(-1);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.d);
    }

    public RedactedSpan(Parcel parcel) {
        this.a = abxo.a(parcel.readInt());
    }
}
