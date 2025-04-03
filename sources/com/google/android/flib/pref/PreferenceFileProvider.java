package com.google.android.flib.pref;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.enpd;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PreferenceFileProvider extends ContentProvider {
    private final SharedPreferences a(String str) {
        return getContext().getSharedPreferences(str, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        char c;
        char c2;
        char c3;
        switch (str.hashCode()) {
            case -1289358244:
                if (str.equals("exists")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -934610812:
                if (str.equals("remove")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -125055845:
                if (str.equals("get_all_keys")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 102230:
                if (str.equals("get")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 111375:
                if (str.equals("put")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 94746189:
                if (str.equals("clear")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            Bundle bundle2 = new Bundle();
            SharedPreferences a = a(str2);
            String string = bundle.getString("key");
            if (!a.contains(string)) {
                return bundle2;
            }
            String string2 = bundle.getString(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
            switch (string2.hashCode()) {
                case -1572742348:
                    if (string2.equals("string_set")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -891985903:
                    if (string2.equals("string")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 104431:
                    if (string2.equals("int")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3327612:
                    if (string2.equals(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG)) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 64711720:
                    if (string2.equals("boolean")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            if (c2 == 0) {
                bundle2.putLong(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, a.getLong(string, 0L));
                return bundle2;
            }
            if (c2 == 1) {
                bundle2.putString(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, a.getString(string, ""));
                return bundle2;
            }
            if (c2 == 2) {
                bundle2.putBoolean(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, a.getBoolean(string, false));
                return bundle2;
            }
            if (c2 == 3) {
                bundle2.putInt(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, a.getInt(string, 0));
                return bundle2;
            }
            if (c2 != 4) {
                throw new IllegalArgumentException("Unknown type: ".concat(String.valueOf(string2)));
            }
            bundle2.putStringArray(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, (String[]) a.getStringSet(string, enpd.a).toArray(new String[0]));
            return bundle2;
        }
        if (c == 1) {
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, a(str2).contains(bundle.getString("key")));
            return bundle3;
        }
        if (c != 2) {
            if (c == 3) {
                a(str2).edit().remove(bundle.getString("key")).apply();
                return Bundle.EMPTY;
            }
            if (c == 4) {
                a(str2).edit().clear().apply();
                return Bundle.EMPTY;
            }
            if (c != 5) {
                throw new IllegalArgumentException("Unknown method: ".concat(String.valueOf(str)));
            }
            Bundle bundle4 = new Bundle();
            bundle4.putStringArray(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, (String[]) a(str2).getAll().keySet().toArray(new String[0]));
            return bundle4;
        }
        String string3 = bundle.getString(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
        String string4 = bundle.getString("key");
        switch (string3.hashCode()) {
            case -1572742348:
                if (string3.equals("string_set")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case -891985903:
                if (string3.equals("string")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 104431:
                if (string3.equals("int")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 3327612:
                if (string3.equals(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG)) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 64711720:
                if (string3.equals("boolean")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        if (c3 == 0) {
            a(str2).edit().putLong(string4, bundle.getLong(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE)).apply();
        } else if (c3 == 1) {
            a(str2).edit().putString(string4, bundle.getString(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE)).apply();
        } else if (c3 == 2) {
            a(str2).edit().putBoolean(string4, bundle.getBoolean(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE)).apply();
        } else if (c3 == 3) {
            a(str2).edit().putInt(string4, bundle.getInt(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE)).apply();
        } else {
            if (c3 != 4) {
                throw new IllegalArgumentException("Unknown type: ".concat(String.valueOf(string3)));
            }
            String[] stringArray = bundle.getStringArray(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE);
            HashSet hashSet = new HashSet(stringArray.length);
            Collections.addAll(hashSet, stringArray);
            a(str2).edit().putStringSet(string4, hashSet).apply();
        }
        return Bundle.EMPTY;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
