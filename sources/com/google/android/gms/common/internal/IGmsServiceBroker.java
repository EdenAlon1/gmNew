package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.common.internal.IGmsCallbacks;
import defpackage.dfwm;
import defpackage.dfwv;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGmsServiceBroker extends IInterface {
    void getService(IGmsCallbacks iGmsCallbacks, GetServiceRequest getServiceRequest);

    /* compiled from: PG */
    public static abstract class Stub extends Binder implements IGmsServiceBroker {
        public static final int FIRST = 1;
        public static final int TRANSACTION_GET_ACCOUNT_DATA_SERVICE = 17;
        public static final int TRANSACTION_GET_ADDRESS_SERVICE = 24;
        public static final int TRANSACTION_GET_ADMOB_SERVICE = 12;
        public static final int TRANSACTION_GET_APP_DATA_SEARCH_SERVICE = 3;
        public static final int TRANSACTION_GET_APP_STATE_SERVICE = 10;
        public static final int TRANSACTION_GET_AUTH_SERVICE_DEPRECATED = 28;
        public static final int TRANSACTION_GET_AUTO_BACKUP_SERVICE = 23;
        public static final int TRANSACTION_GET_CAR_SERVICE = 25;
        public static final int TRANSACTION_GET_CAST_MIRRORING_SERVICE = 15;
        public static final int TRANSACTION_GET_CAST_SERVICE = 19;
        public static final int TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE = 41;
        public static final int TRANSACTION_GET_CLOUD_SAVE_SERVICE = 33;
        public static final int TRANSACTION_GET_COMMON_SERVICE = 40;
        public static final int TRANSACTION_GET_DEVICE_CONNECTION_SERVICE = 44;
        public static final int TRANSACTION_GET_DEVICE_MANAGER_SERVICE = 36;
        public static final int TRANSACTION_GET_DRIVE_SERVICE = 20;
        public static final int TRANSACTION_GET_DROID_GUARD_SERVICE = 13;
        public static final int TRANSACTION_GET_FEEDBACK_SERVICE = 18;
        public static final int TRANSACTION_GET_FITNESS_SERVICE = 30;
        public static final int TRANSACTION_GET_GAMES_SERVICE = 9;
        public static final int TRANSACTION_GET_GLOBAL_SEARCH_ADMIN_SERVICE = 32;
        public static final int TRANSACTION_GET_GOOGLE_LOCATION_MANAGER_SERVICE = 8;
        public static final int TRANSACTION_GET_IDENTITY_SERVICE = 27;
        public static final int TRANSACTION_GET_KIDS_SERVICE = 45;
        public static final int TRANSACTION_GET_LIGHTWEIGHT_APP_DATA_SEARCH_SERVICE = 21;
        public static final int TRANSACTION_GET_LOCATION_SERVICE = 7;
        public static final int TRANSACTION_GET_LOCKBOX_SERVICE = 14;
        public static final int TRANSACTION_GET_NETWORK_QUALITY_SERVICE = 16;
        public static final int TRANSACTION_GET_PANORAMA_SERVICE = 2;
        public static final int TRANSACTION_GET_PEOPLE_SERVICE = 5;
        public static final int TRANSACTION_GET_PLAY_LOG_SERVICE = 11;
        public static final int TRANSACTION_GET_PLUS_SERVICE = 1;
        public static final int TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE = 37;
        public static final int TRANSACTION_GET_REMINDERS_SERVICE = 38;
        public static final int TRANSACTION_GET_REPORTING_SERVICE = 6;
        public static final int TRANSACTION_GET_SEARCH_ADMINISTRATION_SERVICE = 22;
        public static final int TRANSACTION_GET_SEARCH_CORPORA_SERVICE = 35;
        public static final int TRANSACTION_GET_SEARCH_QUERIES_SERVICE = 31;
        public static final int TRANSACTION_GET_SERVICE = 46;
        public static final int TRANSACTION_GET_UDC_SERVICE = 34;
        public static final int TRANSACTION_GET_USAGE_REPORTING_SERVICE = 43;
        public static final int TRANSACTION_GET_WALLET_SERVICE = 4;
        public static final int TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE = 42;
        public static final int TRANSACTION_GET_WEARABLE_SERVICE = 26;
        public static final int TRANSACTION_VALIDATE_ACCOUNT = 47;

        public Stub() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
        }

        public static IGmsServiceBroker asInterface(IBinder iBinder) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IGmsServiceBroker)) ? new dfwm(iBinder) : (IGmsServiceBroker) queryLocalInterface;
        }

        protected void getLegacyService(int i, IGmsCallbacks iGmsCallbacks, int i2, String str, String str2, String[] strArr, Bundle bundle, IBinder iBinder, String str3, String str4) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0055. Please report as an issue. */
        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String[] createStringArray;
            String readString;
            String str;
            Bundle bundle;
            IBinder iBinder;
            String str2;
            int i3;
            String[] strArr;
            Stub stub;
            if (i <= 0 || i > 16777215) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks asInterface = IGmsCallbacks.Stub.asInterface(parcel.readStrongBinder());
            if (i == 46) {
                getService(asInterface, parcel.readInt() != 0 ? GetServiceRequest.CREATOR.createFromParcel(parcel) : null);
            } else if (i == 47) {
                validateAccount(asInterface, parcel.readInt() != 0 ? ValidateAccountRequest.CREATOR.createFromParcel(parcel) : null);
            } else {
                int readInt = parcel.readInt();
                String readString2 = i != 4 ? parcel.readString() : null;
                switch (i) {
                    case 1:
                        String readString3 = parcel.readString();
                        createStringArray = parcel.createStringArray();
                        readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                            str = readString3;
                            iBinder = null;
                        } else {
                            str = readString3;
                            bundle = null;
                            iBinder = null;
                        }
                        str2 = iBinder;
                        strArr = createStringArray;
                        stub = this;
                        i3 = i;
                        break;
                    case 2:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 23:
                    case 25:
                    case 27:
                    case 37:
                    case 38:
                    case 41:
                    case 43:
                        if (parcel.readInt() != 0) {
                            i3 = i;
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                            readString = null;
                            strArr = null;
                            iBinder = null;
                            str = iBinder;
                            str2 = str;
                            stub = this;
                            break;
                        }
                    case 3:
                    case 4:
                    case 21:
                    case 22:
                    case 24:
                    case 26:
                    case 28:
                    case 29:
                    case 31:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                    case 40:
                    case 42:
                    case 44:
                    case 45:
                    default:
                        i3 = i;
                        readString = null;
                        strArr = null;
                        bundle = strArr;
                        iBinder = bundle;
                        str = iBinder;
                        str2 = str;
                        stub = this;
                        break;
                    case 9:
                        String readString4 = parcel.readString();
                        createStringArray = parcel.createStringArray();
                        String readString5 = parcel.readString();
                        str = readString5;
                        iBinder = parcel.readStrongBinder();
                        str2 = parcel.readString();
                        readString = readString4;
                        bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                        strArr = createStringArray;
                        stub = this;
                        i3 = i;
                        break;
                    case 10:
                        String readString6 = parcel.readString();
                        i3 = i;
                        strArr = parcel.createStringArray();
                        readString = readString6;
                        bundle = null;
                        iBinder = bundle;
                        str = iBinder;
                        str2 = str;
                        stub = this;
                        break;
                    case 19:
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (parcel.readInt() != 0) {
                            i3 = i;
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                            iBinder = readStrongBinder;
                            readString = null;
                            strArr = null;
                            str = null;
                        } else {
                            i3 = i;
                            iBinder = readStrongBinder;
                            readString = null;
                            strArr = null;
                            bundle = null;
                            str = null;
                        }
                        str2 = str;
                        stub = this;
                        break;
                    case 20:
                    case 30:
                        String[] createStringArray2 = parcel.createStringArray();
                        String readString7 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                            strArr = createStringArray2;
                            iBinder = null;
                        } else {
                            strArr = createStringArray2;
                            bundle = null;
                            iBinder = null;
                        }
                        str = iBinder;
                        str2 = str;
                        readString = readString7;
                        stub = this;
                        i3 = i;
                        break;
                    case 34:
                        i3 = i;
                        readString = parcel.readString();
                        strArr = null;
                        bundle = strArr;
                        iBinder = bundle;
                        str = iBinder;
                        str2 = str;
                        stub = this;
                        break;
                }
                stub.getLegacyService(i3, asInterface, readInt, readString2, readString, strArr, bundle, iBinder, str, str2);
            }
            dfwv.n(parcel2);
            parcel2.writeNoException();
            return true;
        }

        protected void validateAccount(IGmsCallbacks iGmsCallbacks, ValidateAccountRequest validateAccountRequest) {
            throw new UnsupportedOperationException();
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
