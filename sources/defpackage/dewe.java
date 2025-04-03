package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PhraseAffinityCorpusSpec;
import com.google.android.gms.appdatasearch.PhraseAffinitySpecification;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dewe implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        PhraseAffinityCorpusSpec[] phraseAffinityCorpusSpecArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (dfxj.d(readInt) != 1) {
                dfxj.C(parcel, readInt);
            } else {
                phraseAffinityCorpusSpecArr = (PhraseAffinityCorpusSpec[]) dfxj.J(parcel, readInt, PhraseAffinityCorpusSpec.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new PhraseAffinitySpecification(phraseAffinityCorpusSpecArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PhraseAffinitySpecification[i];
    }
}
