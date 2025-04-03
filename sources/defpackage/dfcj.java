package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AccountWithZuulKeyRetrievalIntent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfcj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Account account = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                account = (Account) dfxj.n(parcel, readInt, Account.CREATOR);
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                pendingIntent = (PendingIntent) dfxj.n(parcel, readInt, PendingIntent.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new AccountWithZuulKeyRetrievalIntent(account, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountWithZuulKeyRetrievalIntent[i];
    }
}
